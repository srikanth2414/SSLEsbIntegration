package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"PromotionHead"
})
public class Promotion {

	@JsonProperty("PromotionHead")
	private PromotionHead promotionHead;

	@JsonProperty("PromotionHead")
	public PromotionHead getPromotionHead() {
		return promotionHead;
	}

	@JsonProperty("PromotionHead")
	public void setPromotionHead(PromotionHead promotionHead) {
		this.promotionHead = promotionHead;
	}

}