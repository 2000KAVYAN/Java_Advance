package com.myapp.sample;

import com.myapp.sample.controllers.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SampleApplication.class, args);
		ConfigurableApplicationContext context= SpringApplication.run(SampleApplication.class, args);

		Alien a= context.getBean(Alien.class);
		a.show();
	}


}
