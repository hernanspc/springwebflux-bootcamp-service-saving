package com.springwebflux.bootcamp.service.saving.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springwebflux.bootcamp.service.saving.app.services.SavingServicesImplement;
import com.springwebflux.bootcamp.service.saving.app.model.Saving;
 
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")

public class RestControllerSaving {

@Autowired 
SavingServicesImplement implement;

@GetMapping("/getSaving")
	Flux<Saving>getSaving()
	{
	return implement.getSaving();
	}	
 
 @PostMapping("/createSaving")
	Mono<Saving> CreateSaving(@RequestBody Saving saving){		
		return implement.createSaving(saving);		
	}
	
 @DeleteMapping("/deleteSaving/{id}")
	Mono<Void> deleteSavingMono(@PathVariable String id){		
		return implement.deleteSaving(id);		
	}
	
 @PutMapping("/updateSaving")
	Mono<Saving> UpdateSaving(@RequestBody Saving saving){		
		
		return implement.updateSaving(saving);		
	}

 @GetMapping("/getSavingDni/{id}")
	Mono<Saving>getSavingId(@PathVariable String id){		
		return implement.getSavingId(id);		
	}
	
 @GetMapping("/txt")
	public String txt(){		
		return "hola";		
	}



}
