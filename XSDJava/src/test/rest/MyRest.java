package test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myRestService")
public class MyRest {

	// @GET here defines, this method will method will process HTTP GET
	// requests.
	//http://localhost:8080/XSDJava/rest/myRestService/name/Gigel
	@GET
	// @Path here defines method level path. Identifies the URI path that a
	// resource class method will serve requests for.
	@Path("/name/{pString}")
	// @Produces here defines the media type(s) that the methods
	// of a resource class can produce.
	@Produces(MediaType.TEXT_XML)
	// @PathParam injects the value of URI parameter that defined in @Path
	// expression, into the method.
	public String userName(@PathParam("pString") String s) {

		String name = s;
		return "<User>" + "<Name>" + name + "</Name>" + "</User>";
	}
	
	

}
