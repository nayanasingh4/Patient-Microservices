package com.patient.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patient.Entity.Patient;



public interface PatientRepository extends CrudRepository<Patient, Integer> {

	public Patient findById(int id);

//	public Patient getPatientByaId(int aid);

	public Patient findBypId(int pid);

//	public List<Patient> findBydId(int did);
}
