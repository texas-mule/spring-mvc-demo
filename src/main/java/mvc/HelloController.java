package mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value="/world", method=RequestMethod.GET)
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello World!");
	}
	
	@GetMapping("/")
	//@ResponseBody
	public String index() {
		return "/static/index.html";
	}
	
	@GetMapping("/{name}")
	@ResponseBody
	public String helloName(@PathVariable("name") String name) {
		return "Hello, " + name;
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:/hello/";
	}
}
