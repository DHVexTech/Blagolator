package fr.intech.s5.backend.blagolator.backendblagolator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class BackendBlagolatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendBlagolatorApplication.class, args);
	}
}
