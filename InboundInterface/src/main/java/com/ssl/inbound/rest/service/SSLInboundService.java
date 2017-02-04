package com.ssl.inbound.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.ssl.inbound.rest.beans.ColorImportRequest;


@Path("/InboundServices")
public class SSLInboundService {

	private static Logger logger = Logger.getLogger(SSLInboundService.class);

	@POST
	@Path("/colors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertColorInfo(ColorImportRequest colorImportRequest ) {

		logger.info("--------Item import service received data--------");

		return SSLInboundServiceImpl.insertColorInfo(colorImportRequest);
	}
	
	@PUT
	@Path("/colors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateColorInfo(ColorImportRequest colorImportRequest ) {
		
		return SSLInboundServiceImpl.updateColorInfo(colorImportRequest);
	}
	
	@DELETE
	@Path("/colors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteColorInfo(ColorImportRequest colorImportRequest ) {
		
		return SSLInboundServiceImpl.deleteColorInfo(colorImportRequest);
	}
}
