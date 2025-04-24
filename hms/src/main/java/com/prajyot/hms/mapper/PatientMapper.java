package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Patient;
import com.prajyot.hms.dto.PatientDTO;

public class PatientMapper {

    public static PatientDTO toDTO(Patient patient) {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setPatientId(patient.getPatientId());
        patientDTO.setName(patient.getName());
        patientDTO.setGender(patient.getGender());
        patientDTO.setDob(patient.getDob());
        patientDTO.setMaritalStatus(patient.getMaritalStatus());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setVipStatus(patient.getVipStatus());
        patientDTO.setReferredBy(patient.getReferredBy());
        patientDTO.setWpNumber(patient.getWpNumber());
        patientDTO.setMobileNumber(patient.getMobileNumber());
        patientDTO.setStatus(patient.isStatus());
        return patientDTO;
    }
}
