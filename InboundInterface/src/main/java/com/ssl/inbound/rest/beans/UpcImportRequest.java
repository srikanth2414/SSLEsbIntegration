package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"upc"
})
public class UpcImportRequest {

	@JsonProperty("upc")
	private List<Upc> upc = null;

	@JsonProperty("upc")
	public List<Upc> getUpc() {
		return upc;
	}

	@JsonProperty("upc")
	public void setUpc(List<Upc> upc) {
		this.upc = upc;
	}

}