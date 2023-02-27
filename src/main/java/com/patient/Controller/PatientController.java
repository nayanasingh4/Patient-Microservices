package com.patient.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.patient.Entity.Patient;
import com.patient.Service.PatientService;
import com.patient.VO.ResponseTemplate;




@RestController
public class PatientController {

	@Autowired
	public PatientService patientService;

	@GetMapping("/patient")
	public List<Patient> getPatient() {
		return this.patientService.getAllPatient();
	}

	@GetMapping("/patient/{id}")
	public Patient getDoctor(@PathVariable("id") int id) {
		return patientService.getPatientId(id);
	}

//	@GetMapping("/patient/pid/{aid}")
//	public Patient getPatientByaId(@PathVariable("aid") int aid) {
//		return patientService.getPatientByaId(aid);
//	}
//
//	// List of patient by doctor Id
//	@GetMapping("/patient/doctorId/{did}")
//	public List<Patient> getDoctorBydId(@PathVariable("did") int did) {
//		return (List<Patient>) patientService.getDoctorBydId(did);
//	}
	
//	// List of patient by doctor Id
//	@GetMapping("/patient/doctorId/{did}")
//	public List<Patient> getDoctorBydId(@PathVariable("did") int did) {
//		return (List<Patient>) patientService.getDoctorBydId(did);
//	}

	@DeleteMapping("/patients/{patientid}")
	public void deletePatient(@PathVariable("patientid") int patientid) {
		this.patientService.deletePatientById(patientid);
	}

	@PostMapping("/patients")
	public Patient addPatient(@RequestBody Patient patient) {
		Patient b = this.patientService.savePatient(patient);
		System.out.println(patient);
		return b;
	}

	@PutMapping("/patients/{patientId}")
	public Patient updatePatient(@RequestBody Patient patient, @PathVariable("patientId") int patientId) {
		this.patientService.updatePatient(patient, patientId);
		return patient;
	}

//	@GetMapping("/patient/pId/{pid}")
//	public ResponseTemplate getAppointmentByaId(@PathVariable("pid") int pid) {
//		return patientService.getPatientBypId(pid);
//	}

}