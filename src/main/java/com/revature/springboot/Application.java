package com.revature.springboot;

import com.revature.springboot.dao.PokemonDao;
import com.revature.springboot.model.Pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
