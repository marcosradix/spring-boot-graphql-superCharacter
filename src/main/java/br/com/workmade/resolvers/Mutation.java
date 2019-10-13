package br.com.workmade.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.workmade.model.Orientation;
import br.com.workmade.model.SuperCharacter;
import br.com.workmade.model.SuperGroup;
import br.com.workmade.repository.SuperCharacterRepository;
import br.com.workmade.repository.SuperGroupRepository;

public class Mutation implements GraphQLMutationResolver{
	
	private SuperCharacterRepository superCharacterRepository;
	private SuperGroupRepository superGroupRepository;
	
	public Mutation(SuperCharacterRepository superCharacterRepository,SuperGroupRepository superGroupRepository) {
		this.superCharacterRepository = superCharacterRepository;
		this.superGroupRepository = superGroupRepository;
	}

	public SuperCharacter addCharacter(String name, int age) {
		return this.superCharacterRepository.save(new SuperCharacter(null, name, age));
	}

	public SuperGroup addGroup(String name, Orientation orientation) {
		return this.superGroupRepository.save(new SuperGroup(name, orientation));
	}
}
