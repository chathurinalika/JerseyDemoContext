package com.demo;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

@Path("/contexts")
public class DemoContext {

	/**
	 * This method used to demo @POST with @Context
	 * URI is - http://localhost:8080/JerseyDemoContext/demo/contexts
	 * 
	 * @param uriInfo - value of UriInfo
	 * @param headers - value of HttpHeaders
	 * 
	 * @return String response
	 */
	@POST
	public String getValue(@Context UriInfo uriInfo, @Context HttpHeaders headers){
		
		String uri = uriInfo.getAbsolutePath().toString();
		String header = headers.getMediaType().toString();
		
		return "Path : '" + uri + "' and Header : '" + header + "'";
	}
}
