package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specialite {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer Id;
	 private String name ;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Specialite(Integer id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
