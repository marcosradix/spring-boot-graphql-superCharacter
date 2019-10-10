package br.com.workmade.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.workmade.model.SuperCharacter;
import br.com.workmade.repository.SuperCharacterRepository;


public class Query implements GraphQLQueryResolver{
	
	private SuperCharacterRepository superCharacterRepository;
	
	
	
	public Query(SuperCharacterRepository superCharacterRepository) {
		super();
		this.superCharacterRepository = superCharacterRepository;
	}



	public List<SuperCharacter> allCharacters(){
		return superCharacterRepository.findAll();
		
	}
	
	public SuperCharacter characterById(String id) {
		return this.superCharacterRepository.findById(id).orElse(null);
	}

}
