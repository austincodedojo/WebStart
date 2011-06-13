package org.austincodedojo.webstart.webapp;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;


import org.junit.Test;


public class WebStartServerTest {
	@Test
	public void helloShouldReturnHtml() throws Exception {
		WebStartServer csvViewerServer = new WebStartServer();
		String actual = csvViewerServer.hello();
		
		assertThat(actual, containsString("<html"));
	}
}
