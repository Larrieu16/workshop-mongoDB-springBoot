package com.larrieu.workshopmongo.dto;

import java.io.Serializable;

import com.larrieu.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{
	private static final long SerialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {
		
	}
	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}
	public AuthorDTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
