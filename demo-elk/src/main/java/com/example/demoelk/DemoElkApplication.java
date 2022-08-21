package com.example.demoelk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
@RestController
public class DemoElkApplication {
	@Value("${logging.file.name}")
	private String LOGGING_FILE;

	public static void main(String[] args) {
		SpringApplication.run(DemoElkApplication.class, args);
	}

	@PostConstruct
	void logConfig(){
		log.info("LOGGING_FILE: {}", LOGGING_FILE);
	}

	@GetMapping("ping/{name}")
	public Object ping(@PathVariable String name){
		log.info("start ping..." + name);
		return "hiiiiiiiii" + name;
	}
}
