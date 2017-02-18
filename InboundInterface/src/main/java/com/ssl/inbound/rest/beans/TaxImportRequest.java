package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"Tax"
})
public class TaxImportRequest {

	@JsonProperty("Tax")
	private List<Tax> tax = null;

	@JsonProperty("Tax")
	public List<Tax> getTax() {
		return tax;
	}

	@JsonProperty("Tax")
	public void setTax(List<Tax> tax) {
		this.tax = tax;
	}

}


