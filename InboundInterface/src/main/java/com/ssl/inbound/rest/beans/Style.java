package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Style {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("StoreCode")
	private String storeCode;
	@JsonProperty("StyleVendorNumber")
	private String styleVendorNumber;
	@JsonProperty("StyleDescription")
	private String styleDescription;
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

	@JsonProperty("StoreCode")
	public String getStoreCode() {
		return storeCode;
	}

	@JsonProperty("StoreCode")
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	@JsonProperty("StyleVendorNumber")
	public String getStyleVendorNumber() {
		return styleVendorNumber;
	}

	@JsonProperty("StyleVendorNumber")
	public void setStyleVendorNumber(String styleVendorNumber) {
		this.styleVendorNumber = styleVendorNumber;
	}

	@JsonProperty("StyleDescription")
	public String getStyleDescription() {
		return styleDescription;
	}

	@JsonProperty("StyleDescription")
	public void setStyleDescription(String styleDescription) {
		this.styleDescription = styleDescription;
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