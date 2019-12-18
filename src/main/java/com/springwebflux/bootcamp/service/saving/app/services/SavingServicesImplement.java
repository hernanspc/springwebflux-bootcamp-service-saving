package com.springwebflux.bootcamp.service.saving.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwebflux.bootcamp.service.saving.app.model.Saving;
import com.springwebflux.bootcamp.service.saving.app.repository.IsavingRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class SavingServicesImplement implements IsavingService{
	@Autowired 
	IsavingRepository repositorio;
	

	@Override
	public Flux<Saving> getSaving() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}


	@Override
	public Mono<Saving> createSaving(Saving saving) {
		// TODO Auto-generated method stub
	 
		return repositorio.save(saving);
	}


	@Override
	public Mono<Void> deleteSaving(String Id) {
		// TODO Auto-generated method stub
		return repositorio.deleteById(Id);
	}


	@Override
	public Mono<Saving> updateSaving(Saving saving) {
		// TODO Auto-generated method stub
		return repositorio.save(saving);
	}
	
	@Override
	public Mono<Saving> getSavingId(String id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return repositorio.findById(id);
	}
}
