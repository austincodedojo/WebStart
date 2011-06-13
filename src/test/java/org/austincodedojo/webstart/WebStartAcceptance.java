package org.austincodedojo.webstart;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class WebStartAcceptance {
	
	@Test
	public void shouldReturnAnHtmlPage() throws Exception {
	    final WebClient webClient = new WebClient();
	    final HtmlPage page = webClient.getPage("http://localhost:8085/web");
	    final String text = page.asXml();
	    assertThat(text, containsString("<html"));
	}
}
