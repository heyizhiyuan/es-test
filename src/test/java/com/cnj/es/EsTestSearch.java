package com.cnj.es;

import com.cnj.es.domain.CustomData;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.*;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.util.Assert;

/**
 * @author czz
 * @since 2022/5/8 下午4:32
 */
@SpringBootTest(classes = {EsApplication.class})
@Slf4j
public class EsTestSearch {

    @Autowired
    ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Autowired
    ElasticsearchOperations elasticsearchOperations;

    @Test
    public void testGetById() {
        CustomData customData = elasticsearchRestTemplate.get("2016033101965161854370999999910201222999000000000000000000000", CustomData.class);
        Assert.notNull(customData, " CustomData is null");
        log.info("customData:" + customData);
    }

    @Test
    public void testGetById2() {
        CustomData customData = elasticsearchRestTemplate.get("2016033101965161854370999999910201222999000000000000000000000", CustomData.class, IndexCoordinates.of("b_data_e"));
        Assert.notNull(customData, " CustomData is null");
        log.info("customData:" + customData);
    }

    @Test
    public void testSearchPage() {
        Pageable pageable = PageRequest.of(0, 10);
        Query query = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.matchQuery("comm_name", "汽车"))
                .withPageable(pageable)
                .build();
        SearchHits<CustomData> searchHits = elasticsearchRestTemplate.search(query, CustomData.class);
        SearchPage<CustomData> searchPage = SearchHitSupport.searchPageFor(searchHits, pageable);
        log.info("当页数据:{}, size={}", searchPage.getContent(), searchPage.getContent().size());
        log.info("总行数:{}", searchPage.getTotalElements());
        log.info("总页数:{}", searchPage.getTotalPages());
    }

    @Test
    public void testHighlightQuery() {
        Pageable pageable = PageRequest.of(0, 10);
        Query query = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.matchQuery("comm_name", "汽车"))
                .withHighlightFields(
                        new HighlightBuilder.Field("comm_name")
                                .preTags("<span class='highlight-text'>")
                                .postTags("</span>")
                )
                .withPageable(pageable)
                .build();
        SearchHits<CustomData> searchHits = elasticsearchRestTemplate.search(query, CustomData.class);
        //searchHits 转换为SearchPage 对象
        SearchPage<CustomData> searchPage = SearchHitSupport.searchPageFor(searchHits, pageable);
        //高亮数据处理
        searchPage.getContent()
                .forEach(searchHit -> {
                    searchHit.getContent().setCommName(String.join("", searchHit.getHighlightField("commName")));
                });
        log.info("当页数据:{}, size={}", searchPage.getContent(), searchPage.getContent().size());
        log.info("总行数:{}", searchPage.getTotalElements());
        log.info("总页数:{}", searchPage.getTotalPages());
    }

    @Test
    public void testSort(){
        Pageable pageable = PageRequest.of(0, 10);
        FieldSortBuilder sortBuilder = new FieldSortBuilder("usd")
                .order(SortOrder.DESC);
        Query query = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.matchQuery("comm_name", "汽车"))
                .withHighlightFields(
                        new HighlightBuilder.Field("comm_name")
                                .preTags("<span class='highlight-text'>")
                                .postTags("</span>")
                )
                .withPageable(pageable)
                .withSort(sortBuilder)
                .build();
        SearchHits<CustomData> searchHits = elasticsearchRestTemplate.search(query, CustomData.class);
        //searchHits 转换为SearchPage 对象
        SearchPage<CustomData> searchPage = SearchHitSupport.searchPageFor(searchHits, pageable);
        //高亮数据处理
        searchPage.getContent()
                .forEach(searchHit -> {
                    searchHit.getContent().setCommName(String.join("", searchHit.getHighlightField("commName")));
                    log.info("当前数据:{}", searchHit.getContent());
                });
        log.info("总行数:{}", searchPage.getTotalElements());
        log.info("总页数:{}", searchPage.getTotalPages());
    }

}

