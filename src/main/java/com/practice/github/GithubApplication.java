package com.practice.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class GithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubApplication.class, args);
		log.info("Hello World");
    log.info("Application logging branch");
	}

}
