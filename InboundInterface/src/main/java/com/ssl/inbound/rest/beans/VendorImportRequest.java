package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"vendor"
})
public class VendorImportRequest {

	@JsonProperty("vendor")
	private List<Vendor> vendor = null;

	@JsonProperty("vendor")
	public List<Vendor> getVendor() {
		return vendor;
	}

	@JsonProperty("vendor")
	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}

}