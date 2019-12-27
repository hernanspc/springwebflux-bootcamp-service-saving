package com.springwebflux.bootcamp.service.saving.app.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.springwebflux.bootcamp.service.saving.app.model.Saving;
import reactor.core.publisher.Mono;
@Repository
public interface IsavingRepository extends ReactiveMongoRepository<Saving, String>{

	Mono<Saving> findById(String Id);
	
}
