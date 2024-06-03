package com.inspira.rag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RagApplication {

	public static void main(String[] args) {
		SpringApplication.run(RagApplication.class, args);
	}

}
