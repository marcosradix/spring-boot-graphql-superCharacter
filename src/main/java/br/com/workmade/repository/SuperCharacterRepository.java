package br.com.workmade.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workmade.model.SuperCharacter;

@Repository
public interface SuperCharacterRepository extends MongoRepository<SuperCharacter, String>{

}
