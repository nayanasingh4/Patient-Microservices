package com.patient.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.patient.Entity.Patient;
import com.patient.Repository.PatientRepository;
import com.patient.VO.Doctor;
import com.patient.VO.ResponseTemplate;



@Service
public class PatientService {
    
//	@Autowired
//	public RestTemplate restTemplate;
	@Autowired
    public PatientRepository patientRepository;
    
    //create patient
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
}
    //get patient list
        public List<Patient> getAllPatient(){
        List<Patient> list=(List<Patient>) this.patientRepository.findAll();
           return list;
        }
        //get patient by id
        public  Patient getPatientId(int pId) {
            return patientRepository.findById(pId);
        }
        //update patient
        public void updatePatient(Patient patient, int pId) {

            patient.setpId(pId);
            patientRepository.save(patient);
       }
        //delete patient by id
        public void deletePatientById( int pId) {
             patientRepository.deleteById(pId);
        }
//        //get patient by appointment id
//        public Patient getPatientByaId(int aid) {
//
//            return patientRepository.getPatientByaId(aid);
//        }
//        
//        public List<Patient> getDoctorBydId(int did) {
//        	List<Patient> patient=null;
//        	patient=this.patientRepository.findBydId(did);
//        	return patient;
//			
//		}
//		public List<Patient> getDoctorBydoctorId(int did) {
//			List<Patient> patient=null;
//        	patient=this.patientRepository.findBydId(did);
//        	return patient;
//		}
//		public List<Patient> getDoctorBydoctorId(int did) {
//			// TODO Auto-generated method stub
//			return null;
//		}
        
//		public ResponseTemplate getPatientBypId(int pid) {
//			ResponseTemplate vo= new ResponseTemplate();
//			Patient patient= this.patientRepository.findBypId(pid);
//			Doctor doctor=restTemplate.getForObject("http://localhost:9095/doctors/appid/" + patient.getaId(), Doctor.class);
//			vo.setPatient(patient);
//			vo.setDoctor(doctor);
//			return vo;
//		}
		
        
}