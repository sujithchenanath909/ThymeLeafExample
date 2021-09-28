package online.sujithchenanath.ThymeLeafExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		System.out.println("Inside Hello");
		model.addAttribute("message","HelloWorld!!");
		return "helloworld";
	}
	
	@GetMapping("/style")
	public String style() {
		
		
		return "css-jsDemo";
	}
	
	@GetMapping("/bootStrapExample")
	public String bootstrapExample() {
		
		
		return "bootstrap-sample";
	}
	
}
