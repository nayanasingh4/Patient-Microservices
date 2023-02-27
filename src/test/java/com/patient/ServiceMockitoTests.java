package com.patient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;



import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.patient.Entity.Patient;
import com.patient.Repository.PatientRepository;
import com.patient.Service.PatientService;




@SpringBootTest(classes= {ServiceMockitoTests.class})
public class ServiceMockitoTests {  
    
    
    
    @Mock
    PatientRepository patientRepository;
    
    @InjectMocks
    PatientService patientService;
    
    public List<Patient> mypatients;
    
    @Test
    @Order(1)
    public void test_getAllPatient() {
        
        List<Patient> myPatients=new ArrayList<Patient>();
        
        myPatients.add(new Patient());
       
        when(patientRepository.findAll()).thenReturn(myPatients); //mocking

        
        assertEquals(1,patientService.getAllPatient().size());
        

    }
    
    @Test
    @Order(2)
    public void test_getPatientById() {
        Patient patient=new Patient(11,"Nayana",121,"n@gmail","123456",43,22);
        when(patientRepository.findById(11)).thenReturn(patient);
        assertEquals(patient, patientService.getPatientId(11));
        
        
//        assertEquals("ss@gmail",patient.getEmail());
        
        
    }
    
    @Test
    @Order(3)
    public void test_addPatient() {
        Patient patient=new Patient(2,"Murli",22,"m@gmail","123456",43,31);
        when(patientRepository.save(patient)).thenReturn(patient);
        assertEquals(patient, patientService.savePatient(patient));
    }
    
    @Test
    @Order(4)
    public void test_updatePatient() {
       Patient patient=(new Patient(3,"Khushi",31,"khushi@gmail","98567",83,71));
       patient.setName("Shital");
       patientRepository.save(patient);
       assertEquals("Shital",patient.getName());
    }
    

    
    @Test
	@Order(5)
	public void deletePatientById() {
    	 Patient delete=(new Patient(3,"Khushi",31,"khushi@gmail","98567",83,71));
    	 delete.setpId(3);
		when(patientRepository.findBypId(3)).thenReturn(delete);
		patientService.deletePatientById(3);
	}
}
   
  
    
    
    
    
    

    




