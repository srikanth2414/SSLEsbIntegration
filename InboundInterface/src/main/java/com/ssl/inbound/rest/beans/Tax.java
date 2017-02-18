package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"TaxHead"
})
public class Tax {

	@JsonProperty("TaxHead")
	private TaxHead taxHead;

	@JsonProperty("TaxHead")
	public TaxHead getTaxHead() {
		return taxHead;
	}

	@JsonProperty("TaxHead")
	public void setTaxHead(TaxHead taxHead) {
		this.taxHead = taxHead;
	}

}