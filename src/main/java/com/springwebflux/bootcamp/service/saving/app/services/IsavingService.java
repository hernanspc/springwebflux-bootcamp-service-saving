package com.springwebflux.bootcamp.service.saving.app.services;

import com.springwebflux.bootcamp.service.saving.app.model.Saving;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IsavingService {

	
	Flux<Saving>getSaving();

	Mono<Saving>createSaving(Saving saving);
	
	Mono<Void>deleteSaving(String Id);
	
	Mono<Saving>updateSaving(Saving saving);
	 
	Mono<Saving>getSavingId(String dni);
}
