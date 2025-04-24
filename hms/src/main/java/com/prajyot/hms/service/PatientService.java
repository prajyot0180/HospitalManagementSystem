package com.prajyot.hms.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.prajyot.hms.entity.Patient;
import com.prajyot.hms.repository.PatientRepository;
import com.prajyot.hms.serviceInterface.PatientServiceInterface;

@Service
public class PatientService implements PatientServiceInterface {

	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public Page<Patient> getAllPatients(int page, int size) {
		try {
			Pageable pageable = PageRequest.of(page, size);
			return patientRepository.findAll(pageable);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Page<Patient> getPatientByName(String name, int page, int size) {
		try {
			Pageable pageable = PageRequest.of(page, size);
			return  patientRepository.findByNameContainingIgnoreCase(name,pageable);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public Page<Patient> getBirthdayPatient(int page, int size) {
		try {
			Pageable pageable = PageRequest.of(page, size);
			return  patientRepository.findByDob(LocalDate.now(),pageable);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public boolean addPatient(Patient patient) {
		Patient newPatient =  patientRepository.save(patient);
		return newPatient != null;
	}

	@Override
	public boolean updatePatient(Patient oldPatient) {
		Optional<Patient> optional = patientRepository.findById(oldPatient.getPatientId());
		Patient patient = optional.get();
		patient.setAddress(oldPatient.getAddress());
		patient.setDob(oldPatient.getDob());
		patient.setEmail(oldPatient.getEmail());
		patient.setGender(oldPatient.getGender());
		patient.setMaritalStatus(oldPatient.getMaritalStatus());
		patient.setMobileNumber(oldPatient.getMobileNumber());
		patient.setVipStatus(oldPatient.getVipStatus());
		patient.setWpNumber(oldPatient.getWpNumber());
		
		Patient checkAdded = patientRepository.save(patient);
		return checkAdded != null;
	}

	@Override
	public boolean deletePatient(int id) {
		Optional<Patient> optional = patientRepository.findById(id);
		Patient patient = optional.get();
		patient.setStatus(false);
		
		Patient checkDeleted = patientRepository.save(patient);
		return checkDeleted != null;
	}

	@Override
	public long totalPatients() {
		long totalPatients = patientRepository.count();
		return totalPatients;
	}

	
}
