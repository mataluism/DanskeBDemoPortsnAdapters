package com.luismata.danskebankdemopna.modules;

import com.luismata.danskebankdemopna.modules.customer.infrastructure.config.CustomerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
		CustomerConfig.class
})
public class DanskebankdemopnaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanskebankdemopnaApplication.class, args);
	}

}
