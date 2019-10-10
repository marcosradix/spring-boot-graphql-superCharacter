package br.com.workmade.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.workmade.model.SuperCharacter;
import br.com.workmade.repository.SuperCharacterRepository;

public class Mutation implements GraphQLMutationResolver{
	
	private SuperCharacterRepository superCharacterRepository;
	
	
	public Mutation(SuperCharacterRepository superCharacterRepository) {
		this.superCharacterRepository = superCharacterRepository;
	}

	public SuperCharacter addCharacter(String name, int age) {
		return this.superCharacterRepository.save(new SuperCharacter(null, name, age));
	}

}
