package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
"style"
})
public class StyleImportRequest {

@JsonProperty("style")
private List<Style> style = null;

@JsonProperty("style")
public List<Style> getStyle() {
return style;
}

@JsonProperty("style")
public void setStyle(List<Style> style) {
this.style = style;
}

}