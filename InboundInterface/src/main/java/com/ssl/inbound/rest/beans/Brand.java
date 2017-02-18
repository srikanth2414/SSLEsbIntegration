package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Brand {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("STOREID")
	private String sTOREID;
	@JsonProperty("BrandCode")
	private String brandCode;
	@JsonProperty("BrandName")
	private String brandName;
	@JsonProperty("BusinessFormat")
	private String businessFormat;
	@JsonProperty("CreateDate")
	private String createDate;
	@JsonProperty("REF1")
	private String rEF1;
	@JsonProperty("REF2")
	private String rEF2;
	@JsonProperty("REF3")
	private String rEF3;

	@JsonProperty("CorelationID")
	public String getCorelationID() {
		return corelationID;
	}

	@JsonProperty("CorelationID")
	public void setCorelationID(String corelationID) {
		this.corelationID = corelationID;
	}

	@JsonProperty("STOREID")
	public String getSTOREID() {
		return sTOREID;
	}

	@JsonProperty("STOREID")
	public void setSTOREID(String sTOREID) {
		this.sTOREID = sTOREID;
	}

	@JsonProperty("BrandCode")
	public String getBrandCode() {
		return brandCode;
	}

	@JsonProperty("BrandCode")
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	@JsonProperty("BrandName")
	public String getBrandName() {
		return brandName;
	}

	@JsonProperty("BrandName")
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@JsonProperty("BusinessFormat")
	public String getBusinessFormat() {
		return businessFormat;
	}

	@JsonProperty("BusinessFormat")
	public void setBusinessFormat(String businessFormat) {
		this.businessFormat = businessFormat;
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
}