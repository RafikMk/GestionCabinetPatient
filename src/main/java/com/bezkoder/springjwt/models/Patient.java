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
	private Integer Id;
	private String username ;
	private Integer latitude ;
	private Integer longitude ;
	private String email ;
	private String tel ;
	  @OneToMany(mappedBy = "Patient")
	    private List<FichePatient> DoctorPatient;
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

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

	public List<FichePatient> getDoctorPatient() {
		return DoctorPatient;
	}

	public void setDoctorPatient(List<FichePatient> doctorPatient) {
		DoctorPatient = doctorPatient;
	}

	public Patient(Integer id, String username, Integer latitude, Integer longitude, String email, String tel,
			List<FichePatient> doctorPatient) {
		super();
		Id = id;
		this.username = username;
		this.latitude = latitude;
		this.longitude = longitude;
		this.email = email;
		this.tel = tel;
		DoctorPatient = doctorPatient;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
