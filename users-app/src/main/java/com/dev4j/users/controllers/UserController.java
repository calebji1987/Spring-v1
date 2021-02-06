package com.dev4j.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev4j.users.models.User;
import com.dev4j.users.services.UserServices;

@RestController
//Definicion de mi recurso
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServices userServices;
	
	@GetMapping
	//Metodo HTTP + Recurso -> Handler methods 
	public ResponseEntity<List<User>> getuser() {
		return new ResponseEntity<List<User>>(userServices.getUsers(),HttpStatus.OK);
	}
}
