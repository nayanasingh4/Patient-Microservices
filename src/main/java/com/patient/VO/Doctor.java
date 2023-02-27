package com.patient.VO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Doctor {
	
	    @Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    private int dId;
	    private String name;
	    private String specialization;
	    private int aId;
	    
	    

	    
	    public int getdId() {
	        return dId;
	    }
	    public void setdId(int dId) {
	        this.dId = dId;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getSpecialization() {
	        return specialization;
	    }
	    public void setSpecialization(String specialization) {
	        this.specialization = specialization;
	    }
	    public int getaId() {
	        return aId;
	    }
	    public void setaId(int aId) {
	        this.aId = aId;
	    }
	    
	}


