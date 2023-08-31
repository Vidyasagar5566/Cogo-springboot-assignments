package com.testing.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class DemoApplication{


	@GetMapping("/hello")
	fun helloworld():String{
		return "hello world"
	}

	@GetMapping("/hello2")
	fun helloworld1():String{
		return "hello world2"
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}


