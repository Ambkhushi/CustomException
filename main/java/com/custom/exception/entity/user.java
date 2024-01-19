package com.custom.exception.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {

	@Id
	private long id;
    private String username;

public user() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
}
