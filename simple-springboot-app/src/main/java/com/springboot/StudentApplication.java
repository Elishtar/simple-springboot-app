package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class StudentApplication {


	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		final HashMap<Integer, String> count = new HashMap<>();
		final List<String> strings = Arrays.asList(
						"sandkadnaks dnaskdn daldsnaksj daldsnaksj",
						"sandkadnaks daldsnaksj",
						"sandkadnaks dnaskdn daldsnaksj",
						"sandkadnaks dnaskdn daldsnaksj daldsnaksj daldsnaksj");
		int key = 0;
		count.compute(
						key, (x, s) -> {return s;}
		);

	}
}
