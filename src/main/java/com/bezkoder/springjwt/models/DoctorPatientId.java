package com.bezkoder.springjwt.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable

public class DoctorPatientId implements Serializable {
    
    private int Doctor;
    private int Patient;
	public int getDoctor() {
		return Doctor;
	}
	public void setDoctor(int doctor) {
		Doctor = doctor;
	}
	public int getPatient() {
		return Patient;
	}
	public void setPatient(int patient) {
		Patient = patient;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Doctor, Patient);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoctorPatientId other = (DoctorPatientId) obj;
		return Doctor == other.Doctor && Patient == other.Patient;
	}

    // getters/setters and most importantly equals() and hashCode()
    
    
}