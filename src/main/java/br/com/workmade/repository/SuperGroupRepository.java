package br.com.workmade.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workmade.model.SuperGroup;

@Repository
public interface SuperGroupRepository extends MongoRepository<SuperGroup, String>{

	SuperGroup findByName(String name);
	
}
