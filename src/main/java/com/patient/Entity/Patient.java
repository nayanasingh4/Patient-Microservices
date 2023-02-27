package com.patient.Entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
//	private int aId;
//	private int dId;
	private String name;
	private int age;
	private String email;
	private String phone;
	private String symptom;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Patient_Id",referencedColumnName = "pId")
	
	private List<Appointment> appointment;
	

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public Patient(int pId,  String name, int age, String email, String phone, String symptom) {
		super();
		this.pId = pId;
//		this.aId = aId;
//		this.dId = dId;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.symptom = symptom;
	}

	public Patient(int i, String string, int j, String string2, String string3, int k, int l) {
		// TODO Auto-generated constructor stub
	}

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

//	public int getaId() {
//		return aId;
//	}
//
//	public void setaId(int aId) {
//		this.aId = aId;
//	}
//
//	public int getdId() {
//		return dId;
//	}
//
//	public void setdId(int dId) {
//		this.dId = dId;
//	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

}
