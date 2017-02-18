package com.ssl.inbound.rest.beans;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({"brand"})
public class BrandImportRequest {

	@JsonProperty("brand")
	private List<Brand> brand = null;

	@JsonProperty("brand")
	public List<Brand> getBrand() {
		return brand;
	}

	@JsonProperty("brand")
	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}


}