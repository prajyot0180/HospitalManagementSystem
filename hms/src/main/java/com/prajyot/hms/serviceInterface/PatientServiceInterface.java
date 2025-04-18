package com.prajyot.hms.serviceInterface;

import java.util.List;

import org.springframework.data.domain.Page;

import com.prajyot.hms.entity.Patient;

public interface PatientServiceInterface {

	Page<Patient> getAllPatients(int page, int size);

	Page<Patient> getPatientByName(String name, int page, int size);

	boolean addPatient(Patient patient);

	boolean updatePatient(Patient patient);

}
