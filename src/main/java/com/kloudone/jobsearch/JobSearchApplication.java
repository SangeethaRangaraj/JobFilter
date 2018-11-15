package com.kloudone.jobsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages="com.kloudone.jobsearch.jpa")
@SpringBootApplication
public class JobSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobSearchApplication.class, args);
	}
}
