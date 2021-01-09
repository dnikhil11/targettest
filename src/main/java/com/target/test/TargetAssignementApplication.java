 package com.target.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TargetAssignementApplication  {

	public static void main(String[] args) {
		SpringApplication.run(TargetAssignementApplication.class, args);
	}

}
