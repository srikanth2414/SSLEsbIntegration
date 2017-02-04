package com.ssl.inbound.rest.service;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;

import com.ssl.inbound.rest.beans.Color;
import com.ssl.inbound.rest.beans.ColorImportRequest;
import com.ssl.inbound.rest.beans.ServiceResponse;
import com.ssl.inbound.rest.service.dao.ColorDAO;

public class SSLInboundServiceImpl {

	private static Logger logger = Logger.getLogger(SSLInboundServiceImpl.class);

	public static Response insertColorInfo(ColorImportRequest colorImportRequest ) {

		logger.info("--------Item import service received data--------");

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);
						
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	
	public static Response updateColorInfo(ColorImportRequest colorImportRequest ) {

		logger.info("--------Item import service received data--------");

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);
						
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	
	public static Response deleteColorInfo(ColorImportRequest colorImportRequest ) {

		logger.info("--------Item import service received data--------");

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);
						
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
}
