package com.example.demoelk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class DemoElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoElkApplication.class, args);
	}

	@GetMapping("ping")
	public Object ping(){
		log.info("start ping...");
		return "hiiiiiiiii";
	}
}
