package com.springwebflux.bootcamp.service.saving.app.model;
 

import java.awt.List;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import reactor.core.publisher.Mono;

public class Saving {

@Document(collection = "saving")
public class Personal {

@Id
	private String id;
	private String dni;
	private String nombres;
	private String number_account;
	private double cash;
	Mono<String> titular = new ArrayList<>();
	
 
	 
	
 
	
	
}
}