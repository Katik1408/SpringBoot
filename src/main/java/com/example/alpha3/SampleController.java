package com.example.alpha3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("data")
	public String getData() {
		return "Hello";
	}
}
