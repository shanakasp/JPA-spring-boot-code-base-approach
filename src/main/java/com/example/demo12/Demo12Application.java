package com.example.demo12;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo12Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo12Application.class, args);
	}

	@Bean

	CommandLineRunner commandLineRunner(studentRepository studentRepository)
	{
		return args -> {
			student shanaka = new student(1,"shanaka","prince", "shanak@gmail.com",14);
			studentRepository.save(shanaka);

			student shanaka123 = new student(2,"shanaka123","prince123", "shanak123@gmail.com",24);
			studentRepository.save(shanaka123);
		};
	}

}
