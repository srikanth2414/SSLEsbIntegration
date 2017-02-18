package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"storehierarchy"
})
public class StoreImportRequest {

	@JsonProperty("storehierarchy")
	private List<Storehierarchy> storehierarchy = null;

	@JsonProperty("storehierarchy")
	public List<Storehierarchy> getStorehierarchy() {
		return storehierarchy;
	}

	@JsonProperty("storehierarchy")
	public void setStorehierarchy(List<Storehierarchy> storehierarchy) {
		this.storehierarchy = storehierarchy;
	}

}