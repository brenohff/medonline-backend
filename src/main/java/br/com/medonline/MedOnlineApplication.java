package br.com.medonline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedOnlineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MedOnlineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
