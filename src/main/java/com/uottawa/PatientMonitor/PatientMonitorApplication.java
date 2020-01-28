package com.uottawa.PatientMonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.uottawa.PatientMonitor.*")
public class PatientMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientMonitorApplication.class, args);
	}

}
