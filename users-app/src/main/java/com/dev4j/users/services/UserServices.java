package com.dev4j.users.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev4j.users.models.User;
import com.github.javafaker.Faker;

@Service
public class UserServices {
	@Autowired
	private Faker faker;
	private List<User> users= new ArrayList<>();
	@PostConstruct
	public void init() {
		for(int i=0;i<100;i++) {
			
			users.add(new User(faker.funnyName().name(),faker.name().username(),faker.dragonBall().character()));
		}
	}
//	codigo para el servicio
	public List<User> getUsers() {
		return users;
	}
	
	
}
