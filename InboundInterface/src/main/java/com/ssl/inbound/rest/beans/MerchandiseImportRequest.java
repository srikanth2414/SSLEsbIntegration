package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"merchandise"
})
public class MerchandiseImportRequest {

	@JsonProperty("merchandise")
	private List<Merchandise> merchandise = null;

	@JsonProperty("merchandise")
	public List<Merchandise> getMerchandise() {
		return merchandise;
	}

	@JsonProperty("merchandise")
	public void setMerchandise(List<Merchandise> merchandise) {
		this.merchandise = merchandise;
	}

}