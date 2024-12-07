package com.labexam.jfsdlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.labexam.jfsdlab")
public class JfsdlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfsdlabApplication.class, args);
	}

}
