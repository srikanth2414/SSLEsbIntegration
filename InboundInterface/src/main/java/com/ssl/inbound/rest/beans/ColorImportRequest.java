package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({"colors"})
public class ColorImportRequest {

	@JsonProperty("colors")
	private List<Color> colors = null;

	@JsonProperty("colors")
	public List<Color> getColors() {
		return colors;
	}

	@JsonProperty("colors")
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}

}
