package com.tutoriales.apps.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@GetMapping("HolaMundo")
	public String HolaMundo() {
		return "Hola Mundo";
	}
}
