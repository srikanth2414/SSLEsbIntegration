package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ServiceResponse
{
	private String responseCode;
	private String responseMessage;
	private String corelationID;
	private String errorCode;
	private String errorMessage;

	public String getResponseMessage()
	{
		return this.responseMessage;
	}

	public void setResponseMessage(String responseMessage)
	{
		this.responseMessage = responseMessage;
	}

	public String getResponseCode()
	{
		return this.responseCode;
	}

	public void setResponseCode(String ResponseCode)
	{
		this.responseCode = ResponseCode;
	}

	public String getCorelationID()
	{
		return this.corelationID;
	}

	public void setCorelationID(String corelationID)
	{
		this.corelationID = corelationID;
	}

	public String getErrorCode()
	{
		return this.errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getErrorMessage()
	{
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}
