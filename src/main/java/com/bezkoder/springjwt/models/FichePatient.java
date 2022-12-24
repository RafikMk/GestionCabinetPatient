package com.bezkoder.springjwt.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;

@Entity
@IdClass(DoctorPatientId.class)

public class FichePatient {
	 @Id
	    @ManyToOne
	    @JoinColumn(name = "Doctor_id", referencedColumnName = "id")
	    private Doctor Doctor;
	    @Id
	    @ManyToOne
	    @JoinColumn(name = "Patient_id", referencedColumnName = "id")
	    private Patient Patient;

	    @OneToMany
	    private List<RendezVous> RendezVous ;
		public Doctor getDoctor() {
			return Doctor;
		}
		public void setDoctor(Doctor doctor) {
			Doctor = doctor;
		}
		public Patient getPatient() {
			return Patient;
		}
		public void setPatient(Patient patient) {
			Patient = patient;
		}

		public List<RendezVous> getRendezVous() {
			return RendezVous;
		}
		public void setRendezVous(List<RendezVous> rendezVous) {
			RendezVous = rendezVous;
		}
		public FichePatient(com.bezkoder.springjwt.models.Doctor doctor, com.bezkoder.springjwt.models.Patient patient,
			List<com.bezkoder.springjwt.models.RendezVous> rendezVous) {
			super();
			Doctor = doctor;
			Patient = patient;
			RendezVous = rendezVous;
		}
		public FichePatient() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
