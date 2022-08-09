package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);
	}


		@Bean
		public CommandLineRunner run(AdminRepository repository){
			return (args->{
				insertEmployeeDetails(repository);
				System.out.println(repository.findAll());
			});
		}


		private void insertEmployeeDetails(AdminRepository repository){

		repository.save(new Employee("Praveenas1","Tanjore"));
		repository.save(new Employee("Priyas1","Chennai"));
		repository.save(new Employee("Poojas1","Tanjore"));
	}




}
