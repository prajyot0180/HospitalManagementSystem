package com.prajyot.hms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prajyot.hms.entity.Doctor;
import com.prajyot.hms.repository.DoctorRepository;
import com.prajyot.hms.serviceInterface.DoctorServiceInterface;

@Service
public class DoctorService implements DoctorServiceInterface {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Override
	public boolean addDoctor(Doctor doctor) {
		Doctor newDoctor =  doctorRepository.save(doctor);
		return newDoctor != null;
	}

	@Override
	public boolean updateDoctor(Doctor oldDoctor) {
		Optional<Doctor> optional = doctorRepository.findById(oldDoctor.getDoctorId()); 
		Doctor doctor = optional.get();
		doctor.setAvailability(oldDoctor.getAvailability());
		doctor.setSpecialization(oldDoctor.getSpecialization());
		doctor.setName(oldDoctor.getName());
		
		Doctor checkSaved = doctorRepository.save(doctor);
		return checkSaved != null;
	}
}
