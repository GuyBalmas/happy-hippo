package org.example.happy_hippo.controllers;

import org.example.happy_hippo.html.HtmlTemplate;
import org.example.happy_hippo.kubernetes.K8sHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {
	private final String coffeeImagePath = "https://media.istockphoto.com/id/1142411258/photo/how-to-make-coffee-latte-art.jpg?b=1&s=170667a&w=0&k=20&c=Yy1VEmlihscejIQ7o5hd43Jq5elwEpAiF32suyiS2M0=";

	@Value("${greeting.message}")
	private String greeting_message;

	@Value("${greeting.description}")
	private String greeting_desc;

	@GetMapping("/")
	public String index() {
		 return HtmlTemplate.htmlLandingPage(
				 "Hello from example-app!",
				 "a simple Java spring-Boot web application</br>",
				 "Application pod: '" + K8sHandler.getPodName() + "'</br> Namespace: '" + K8sHandler.getNamespace() + "'"
		 );
	}

	@GetMapping("/welcome")
	public String welcome(){
		return HtmlTemplate.htmlLandingPage(
				greeting_message,
				greeting_desc
		);
	}

	@GetMapping("/coffee")
	public String coffee(){
		return HtmlTemplate.htmlLandingPage(
				"Who doesn't like coffee?",
				"my favorite is Cappuccino!",
				"",
				coffeeImagePath
		);
	}
}