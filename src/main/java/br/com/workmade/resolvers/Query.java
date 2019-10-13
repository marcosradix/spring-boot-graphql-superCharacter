package br.com.workmade.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.workmade.model.SuperCharacter;
import br.com.workmade.model.SuperGroup;
import br.com.workmade.repository.SuperCharacterRepository;
import br.com.workmade.repository.SuperGroupRepository;


public class Query implements GraphQLQueryResolver{
	
	private SuperCharacterRepository superCharacterRepository;
	private SuperGroupRepository superGroupRepository;
	
	
	public Query(SuperCharacterRepository superCharacterRepository,SuperGroupRepository superGroupRepository) {
		this.superCharacterRepository = superCharacterRepository;
		this.superGroupRepository = superGroupRepository;
	}


	public List<SuperCharacter> allCharacters(){
		return superCharacterRepository.findAll();
		
	}
	
	public SuperCharacter characterById(String id) {
		return this.superCharacterRepository.findById(id).orElse(null);
	}

	public List<SuperGroup> groups(){
		return this.superGroupRepository.findAll();
	}
	
	public SuperGroup groupByName(String name) {
		return this.superGroupRepository.findByName(name);
		
	}

}
