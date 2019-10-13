package br.com.workmade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.workmade.model.SuperCharacter;
import br.com.workmade.repository.SuperCharacterRepository;

@SpringBootApplication
public class SpringBootGraphqlSuperCharacterApplication {
	@Autowired
	private SuperCharacterRepository superCharacterRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphqlSuperCharacterApplication.class, args);
	}

//@PostConstruct
	@SuppressWarnings("unused")
	private void loadData() {
		
		this.superCharacterRepository.save(new SuperCharacter(null, "Deu certo", 30));
		
		
	}
}
