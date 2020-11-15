package mx.gob.bienestar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class StampApplication {

	public static void main(String[] args) {
		SpringApplication.run(StampApplication.class, args);

	}

}
