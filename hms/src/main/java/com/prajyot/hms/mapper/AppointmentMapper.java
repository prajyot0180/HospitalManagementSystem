package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Appointment;
import com.prajyot.hms.dto.AppointmentDTO;

public class AppointmentMapper {

    public static AppointmentDTO toDTO(Appointment appointment) {
        if (appointment == null) {
            return null;
        }

        AppointmentDTO appointmentDTO = new AppointmentDTO();
        appointmentDTO.setAppointmentId(appointment.getAppointmentId());
        appointmentDTO.setPatientId(appointment.getPatientId());// != null ? appointment.getPatient().getPatientId() : null);
        appointmentDTO.setDoctorId(appointment.getDoctorId()); //!= null ? appointment.getDoctor().getDoctorId() : null);
        appointmentDTO.setDate(appointment.getDate());
        appointmentDTO.setTime(appointment.getTime());
        appointmentDTO.setStatus(appointment.getStatus());
        appointmentDTO.setSession(appointment.getSession());

        return appointmentDTO;
    }
    
    

}
