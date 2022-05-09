package com.cnj.es.domain;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;

/**
 * @author czz
 * @since 2022/5/8 下午4:23
 */
@Document(indexName = "b_data_e", createIndex = false)
public class CustomData {

    @Field(name = "tren_id", type = FieldType.Keyword, index = true)
    private String trenId;

    @Field(name = "comm_id", type = FieldType.Keyword)
    private String commId;

    @Field(name = "frta_id", type = FieldType.Keyword)
    private String frtaId;

    @Field(name = "trwa_id", type = FieldType.Keyword)
    private String trwaId;

    @Field(name = "prsa_id", type = FieldType.Keyword)
    private String prsaId;

    @Field(name = "cust_id", type = FieldType.Keyword)
    private String custId;

    @Field(name = "tpwa_id", type = FieldType.Keyword)
    private String tpwaId;

    @Field(name = "trcn_id", type = FieldType.Keyword)
    private String trcnId;

    @Field(name = "port_id", type = FieldType.Keyword)
    private String portId;

    @Field(name = "trco_id", type = FieldType.Keyword)
    private String trcoId;

    @Field(name = "tren_id", type = FieldType.Text)
    private String trenName;

    @Field(name = "comm_name", type = FieldType.Text)
    private String commName;

    @Field(name = "frta_name", type = FieldType.Text)
    private String frtaName;

    @Field(name = "trwa_name", type = FieldType.Text)
    private String trwaName;

    @Field(name = "prsa_name", type = FieldType.Text)
    private String prsaName;

    @Field(name = "cust_name", type = FieldType.Text)
    private String custName;

    @Field(name = "tpwa_name", type = FieldType.Text)
    private String tpwaName;

    @Field(name = "trcn_name", type = FieldType.Text)
    private String trcnName;

    @Field(name = "port_name", type = FieldType.Text)
    private String portName;

    @Field(name = "trco_name", type = FieldType.Text)
    private String trcoName;


    @Field(name = "qunt", type = FieldType.Long)
    private Long qunt;

    @Field(name = "sumq", type = FieldType.Long)
    private Long sumq;

    @Field(name = "usd", type = FieldType.Long)
    private BigDecimal usd;

    @Field(name = "summ", type = FieldType.Long)
    private BigDecimal summ;

    @Field(name = "usd_rmb", type = FieldType.Long)
    private BigDecimal usdRmb;

    @Field(name = "summ_rmb", type = FieldType.Long)
    private BigDecimal summRmb;

    public String getTrenId() {
        return trenId;
    }

    public void setTrenId(String trenId) {
        this.trenId = trenId;
    }

    public String getCommId() {
        return commId;
    }

    public void setCommId(String commId) {
        this.commId = commId;
    }

    public String getFrtaId() {
        return frtaId;
    }

    public void setFrtaId(String frtaId) {
        this.frtaId = frtaId;
    }

    public String getTrwaId() {
        return trwaId;
    }

    public void setTrwaId(String trwaId) {
        this.trwaId = trwaId;
    }

    public String getPrsaId() {
        return prsaId;
    }

    public void setPrsaId(String prsaId) {
        this.prsaId = prsaId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getTpwaId() {
        return tpwaId;
    }

    public void setTpwaId(String tpwaId) {
        this.tpwaId = tpwaId;
    }

    public String getTrcnId() {
        return trcnId;
    }

    public void setTrcnId(String trcnId) {
        this.trcnId = trcnId;
    }

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public String getTrcoId() {
        return trcoId;
    }

    public void setTrcoId(String trcoId) {
        this.trcoId = trcoId;
    }

    public Long getQunt() {
        return qunt;
    }

    public void setQunt(Long qunt) {
        this.qunt = qunt;
    }

    public Long getSumq() {
        return sumq;
    }

    public void setSumq(Long sumq) {
        this.sumq = sumq;
    }

    public BigDecimal getUsd() {
        return usd;
    }

    public void setUsd(BigDecimal usd) {
        this.usd = usd;
    }

    public BigDecimal getSumm() {
        return summ;
    }

    public void setSumm(BigDecimal summ) {
        this.summ = summ;
    }

    public BigDecimal getUsdRmb() {
        return usdRmb;
    }

    public void setUsdRmb(BigDecimal usdRmb) {
        this.usdRmb = usdRmb;
    }

    public BigDecimal getSummRmb() {
        return summRmb;
    }

    public void setSummRmb(BigDecimal summRmb) {
        this.summRmb = summRmb;
    }

    public String getTrenName() {
        return trenName;
    }

    public void setTrenName(String trenName) {
        this.trenName = trenName;
    }

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName;
    }

    public String getFrtaName() {
        return frtaName;
    }

    public void setFrtaName(String frtaName) {
        this.frtaName = frtaName;
    }

    public String getTrwaName() {
        return trwaName;
    }

    public void setTrwaName(String trwaName) {
        this.trwaName = trwaName;
    }

    public String getPrsaName() {
        return prsaName;
    }

    public void setPrsaName(String prsaName) {
        this.prsaName = prsaName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getTpwaName() {
        return tpwaName;
    }

    public void setTpwaName(String tpwaName) {
        this.tpwaName = tpwaName;
    }

    public String getTrcnName() {
        return trcnName;
    }

    public void setTrcnName(String trcnName) {
        this.trcnName = trcnName;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getTrcoName() {
        return trcoName;
    }

    public void setTrcoName(String trcoName) {
        this.trcoName = trcoName;
    }

    @Override
    public String toString() {
        return "CustomData{" +
                "trenId='" + trenId + '\'' +
                ", commId='" + commId + '\'' +
                ", frtaId='" + frtaId + '\'' +
                ", trwaId='" + trwaId + '\'' +
                ", prsaId='" + prsaId + '\'' +
                ", custId='" + custId + '\'' +
                ", tpwaId='" + tpwaId + '\'' +
                ", trcnId='" + trcnId + '\'' +
                ", portId='" + portId + '\'' +
                ", trcoId='" + trcoId + '\'' +
                ", trenName='" + trenName + '\'' +
                ", commName='" + commName + '\'' +
                ", frtaName='" + frtaName + '\'' +
                ", trwaName='" + trwaName + '\'' +
                ", prsaName='" + prsaName + '\'' +
                ", custName='" + custName + '\'' +
                ", tpwaName='" + tpwaName + '\'' +
                ", trcnName='" + trcnName + '\'' +
                ", portName='" + portName + '\'' +
                ", trcoName='" + trcoName + '\'' +
                ", qunt=" + qunt +
                ", sumq=" + sumq +
                ", usd=" + usd +
                ", summ=" + summ +
                ", usdRmb=" + usdRmb +
                ", summRmb=" + summRmb +
                '}';
    }
}
