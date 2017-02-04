package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Color {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("ColorCode")
	private String colorCode;
	@JsonProperty("ColorDescription")
	private String colorDescription;
	@JsonProperty("ColorNames")
	private String colorNames;
	@JsonProperty("BusinessFormat")
	private String businessFormat;
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

	@JsonProperty("ColorCode")
	public String getColorCode() {
		return colorCode;
	}

	@JsonProperty("ColorCode")
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	@JsonProperty("ColorDescription")
	public String getColorDescription() {
		return colorDescription;
	}

	@JsonProperty("ColorDescription")
	public void setColorDescription(String colorDescription) {
		this.colorDescription = colorDescription;
	}

	@JsonProperty("ColorNames")
	public String getColorNames() {
		return colorNames;
	}

	@JsonProperty("ColorNames")
	public void setColorNames(String colorNames) {
		this.colorNames = colorNames;
	}

	@JsonProperty("BusinessFormat")
	public String getBusinessFormat() {
		return businessFormat;
	}

	@JsonProperty("BusinessFormat")
	public void setBusinessFormat(String businessFormat) {
		this.businessFormat = businessFormat;
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