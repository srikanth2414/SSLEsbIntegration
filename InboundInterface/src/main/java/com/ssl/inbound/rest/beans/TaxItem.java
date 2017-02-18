package com.ssl.inbound.rest.beans;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TaxItem {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("StoreCode")
	private String storeCode;
	@JsonProperty("TaxCategory")
	private String taxCategory;
	@JsonProperty("TaxSkuCode")
	private String taxSkuCode;

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

	@JsonProperty("TaxSkuCode")
	public String getTaxSkuCode() {
		return taxSkuCode;
	}

	@JsonProperty("TaxSkuCode")
	public void setTaxSkuCode(String taxSkuCode) {
		this.taxSkuCode = taxSkuCode;
	}

}