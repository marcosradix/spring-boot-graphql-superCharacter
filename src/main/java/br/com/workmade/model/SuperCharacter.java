package br.com.workmade.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SuperCharacter")
public class SuperCharacter {
	
	@Id
	private String id;
	private String name;
	private int age;
	private SuperGroup superGroup;
	
	
	
	
	public SuperCharacter() {}

	public SuperCharacter(String id, String name, int age, SuperGroup superGroup) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.superGroup = superGroup;
	}

	public SuperCharacter(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public SuperGroup getSuperGroup() {
		return superGroup;
	}
	public void setSuperGroup(SuperGroup superGroup) {
		this.superGroup = superGroup;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperCharacter [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	

}
