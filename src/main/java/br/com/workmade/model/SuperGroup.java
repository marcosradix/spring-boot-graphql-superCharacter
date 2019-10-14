package br.com.workmade.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "SuperGroup")
public class SuperGroup {
	
	@Id
	private String id;
	private String name;
	private Orientation orientation;
	@DBRef(lazy = true)
	private List<SuperCharacter> members = new ArrayList<>();
	
	
	
	
	public SuperGroup(String id, String name, Orientation orientation, List<SuperCharacter> members) {
		this.id = id;
		this.name = name;
		this.orientation = orientation;
		this.members = members;
	}
	
	
	
	public SuperGroup() {}



	public SuperGroup(String name, Orientation orientation) {
		this.name = name;
		this.orientation = orientation;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	public List<SuperCharacter> getMembers() {
		return members;
	}
	public void setMembers(List<SuperCharacter> members) {
		this.members = members;
	}
	
	

}
