package com.bezkoder.springjwt.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import javax.persistence.Id;

@Entity

public class Patient {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username ;
	private Integer latitude ;
	private Integer longitude ;
	private String email ;
	private String tel ;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}





	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Patient(Integer id, String username, Integer latitude, Integer longitude, String email, String tel) {
		super();
		this.id = id;
		this.username = username;
		this.latitude = latitude;
		this.longitude = longitude;
		this.email = email;
		this.tel = tel;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
