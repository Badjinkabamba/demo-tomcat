package org.formation.demotomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoTomcatApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTomcatApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello from tomcat V1";
	}

}
