package br.com.workmade.graphProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.workmade.repository.SuperCharacterRepository;
import br.com.workmade.resolvers.Mutation;
import br.com.workmade.resolvers.Query;

@Configuration
public class GraphQLProducer {
	
	@Autowired
	private SuperCharacterRepository superCharacterRepository;

	
	@Bean
	public Query query() {return new Query(superCharacterRepository);}

	@Bean
	public Mutation mutation() { return new Mutation(superCharacterRepository); }
}
