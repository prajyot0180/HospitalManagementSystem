package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Doctor;
import com.prajyot.hms.dto.DoctorDTO;

public class DoctorMapper {

    // Method to convert Doctor entity to DoctorDTO
    public static DoctorDTO toDTO(Doctor doctor) {
        if (doctor == null) {
            return null;
        }

        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDoctorId(doctor.getDoctorId());
        doctorDTO.setName(doctor.getName());
        doctorDTO.setSpecialization(doctor.getSpecialization());
        doctorDTO.setAvailability(doctor.getAvailability());

        return doctorDTO;
    }

}
