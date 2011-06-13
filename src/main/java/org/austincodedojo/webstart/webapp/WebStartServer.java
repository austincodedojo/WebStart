package org.austincodedojo.webstart.webapp;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/web")
public class WebStartServer {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String hello() {
		return "<html></html>";
	}
}
