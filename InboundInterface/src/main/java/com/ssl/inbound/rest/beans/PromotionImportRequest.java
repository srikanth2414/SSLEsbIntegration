package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"promotions"
})
public class PromotionImportRequest {

	@JsonProperty("promotions")
	private List<Promotion> promotions = null;

	@JsonProperty("promotions")
	public List<Promotion> getPromotions() {
		return promotions;
	}

	@JsonProperty("promotions")
	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

}