package com.example.course.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.course.workshopmongo.domain.User;
import com.example.course.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {

//		userRepo.deleteAll();
//		
//		User maria = new User(null, "Maria Brown", "maria@gmail.com");
//		User alex = new User(null, "Alex Green", "alex@gmail.com");
//		User bob = new User(null, "Bob Grey", "bob@gmail.com");
//		
//		userRepo.saveAll(Arrays.asList(maria,alex,bob));
		
	}

}
