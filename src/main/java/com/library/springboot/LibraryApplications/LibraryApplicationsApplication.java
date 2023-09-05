package com.library.springboot.LibraryApplications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan
public class LibraryApplicationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplicationsApplication.class, args);
	}

}
