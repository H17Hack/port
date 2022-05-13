package com.alfonso.Portada.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoControllers {

	@GetMapping("/Portada")
	public String Portada() {
		return "Portada";
	}
}
