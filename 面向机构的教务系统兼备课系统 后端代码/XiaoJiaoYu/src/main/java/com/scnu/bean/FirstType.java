package com.scnu.bean;

public class FirstType {
	
	private String value;
	
	private String id;
	
	private String name;
	
	private String character;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}
	
	public FirstType(String value, String id, String name, String character) {
		this.value = value;
		this.id = id;
		this.name = name;
		this.character = character;
	}

}
