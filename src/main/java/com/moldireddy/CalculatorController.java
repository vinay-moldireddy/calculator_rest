package com.moldireddy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b){
		return a + b ;
	}
	@GetMapping("/mul/{a}/{b}")
	public int mul(@PathVariable int a, @PathVariable int b){
		return a * b;
	}
	@GetMapping("/div/{a}/{b}")
	public float div(@PathVariable int a, @PathVariable int b){
		return (float)a/(float)b;
	}
	@GetMapping("/sub/{a}/{b}")
	public int sub(@PathVariable int a, @PathVariable int b){
		return a - b;
	}
}