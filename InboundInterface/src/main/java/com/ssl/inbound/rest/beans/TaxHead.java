package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TaxHead {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("StoreCode")
	private String storeCode;
	@JsonProperty("TaxCategory")
	private String taxCategory;
	@JsonProperty("TaxAuthority")
	private String taxAuthority;
	@JsonProperty("TaxCode")
	private String taxCode;
	@JsonProperty("TaxArea")
	private String taxArea;
	@JsonProperty("EffectiveDate")
	private String effectiveDate;
	@JsonProperty("EndDate")
	private String endDate;
	@JsonProperty("TaxDescription")
	private String taxDescription;
	@JsonProperty("TaxCalType")
	private String taxCalType;
	@JsonProperty("TaxPercentage")
	private String taxPercentage;
	@JsonProperty("TaxFromAmount")
	private String taxFromAmount;
	@JsonProperty("TaxToAmount")
	private String taxToAmount;
	@JsonProperty("TaxBizFormat")
	private String taxBizFormat;
	@JsonProperty("VatFlag")
	private String vatFlag;
	@JsonProperty("TaxCodeSeq")
	private String taxCodeSeq;
	@JsonProperty("CreateDate")
	private String createDate;
	@JsonProperty("REF1")
	private String rEF1;
	@JsonProperty("REF2")
	private String rEF2;
	@JsonProperty("REF3")
	private String rEF3;
	@JsonProperty("TaxItems")
	private List<TaxItem> taxItems = null;

	@JsonProperty("CorelationID")
	public String getCorelationID() {
		return corelationID;
	}

	@JsonProperty("CorelationID")
	public void setCorelationID(String corelationID) {
		this.corelationID = corelationID;
	}

	@JsonProperty("StoreCode")
	public String getStoreCode() {
		return storeCode;
	}

	@JsonProperty("StoreCode")
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	@JsonProperty("TaxCategory")
	public String getTaxCategory() {
		return taxCategory;
	}

	@JsonProperty("TaxCategory")
	public void setTaxCategory(String taxCategory) {
		this.taxCategory = taxCategory;
	}

	@JsonProperty("TaxAuthority")
	public String getTaxAuthority() {
		return taxAuthority;
	}

	@JsonProperty("TaxAuthority")
	public void setTaxAuthority(String taxAuthority) {
		this.taxAuthority = taxAuthority;
	}

	@JsonProperty("TaxCode")
	public String getTaxCode() {
		return taxCode;
	}

	@JsonProperty("TaxCode")
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	@JsonProperty("TaxArea")
	public String getTaxArea() {
		return taxArea;
	}

	@JsonProperty("TaxArea")
	public void setTaxArea(String taxArea) {
		this.taxArea = taxArea;
	}

	@JsonProperty("EffectiveDate")
	public String getEffectiveDate() {
		return effectiveDate;
	}

	@JsonProperty("EffectiveDate")
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@JsonProperty("EndDate")
	public String getEndDate() {
		return endDate;
	}

	@JsonProperty("EndDate")
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("TaxDescription")
	public String getTaxDescription() {
		return taxDescription;
	}

	@JsonProperty("TaxDescription")
	public void setTaxDescription(String taxDescription) {
		this.taxDescription = taxDescription;
	}

	@JsonProperty("TaxCalType")
	public String getTaxCalType() {
		return taxCalType;
	}

	@JsonProperty("TaxCalType")
	public void setTaxCalType(String taxCalType) {
		this.taxCalType = taxCalType;
	}

	@JsonProperty("TaxPercentage")
	public String getTaxPercentage() {
		return taxPercentage;
	}

	@JsonProperty("TaxPercentage")
	public void setTaxPercentage(String taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	@JsonProperty("TaxFromAmount")
	public String getTaxFromAmount() {
		return taxFromAmount;
	}

	@JsonProperty("TaxFromAmount")
	public void setTaxFromAmount(String taxFromAmount) {
		this.taxFromAmount = taxFromAmount;
	}

	@JsonProperty("TaxToAmount")
	public String getTaxToAmount() {
		return taxToAmount;
	}

	@JsonProperty("TaxToAmount")
	public void setTaxToAmount(String taxToAmount) {
		this.taxToAmount = taxToAmount;
	}

	@JsonProperty("TaxBizFormat")
	public String getTaxBizFormat() {
		return taxBizFormat;
	}

	@JsonProperty("TaxBizFormat")
	public void setTaxBizFormat(String taxBizFormat) {
		this.taxBizFormat = taxBizFormat;
	}

	@JsonProperty("VatFlag")
	public String getVatFlag() {
		return vatFlag;
	}

	@JsonProperty("VatFlag")
	public void setVatFlag(String vatFlag) {
		this.vatFlag = vatFlag;
	}

	@JsonProperty("TaxCodeSeq")
	public String getTaxCodeSeq() {
		return taxCodeSeq;
	}

	@JsonProperty("TaxCodeSeq")
	public void setTaxCodeSeq(String taxCodeSeq) {
		this.taxCodeSeq = taxCodeSeq;
	}

	@JsonProperty("CreateDate")
	public String getCreateDate() {
		return createDate;
	}

	@JsonProperty("CreateDate")
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@JsonProperty("REF1")
	public String getREF1() {
		return rEF1;
	}

	@JsonProperty("REF1")
	public void setREF1(String rEF1) {
		this.rEF1 = rEF1;
	}

	@JsonProperty("REF2")
	public String getREF2() {
		return rEF2;
	}

	@JsonProperty("REF2")
	public void setREF2(String rEF2) {
		this.rEF2 = rEF2;
	}

	@JsonProperty("REF3")
	public String getREF3() {
		return rEF3;
	}

	@JsonProperty("REF3")
	public void setREF3(String rEF3) {
		this.rEF3 = rEF3;
	}

	@JsonProperty("TaxItems")
	public List<TaxItem> getTaxItems() {
		return taxItems;
	}

	@JsonProperty("TaxItems")
	public void setTaxItems(List<TaxItem> taxItems) {
		this.taxItems = taxItems;
	}

}