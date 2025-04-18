package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Receptionist;
import com.prajyot.hms.dto.ReceptionistDTO;

public class ReceptionistMapper {

    // Method to convert Receptionist entity to ReceptionistDTO
    public static ReceptionistDTO toDTO(Receptionist receptionist) {
        if (receptionist == null) {
            return null;
        }

        ReceptionistDTO dto = new ReceptionistDTO();
        dto.setReceptionistId(receptionist.getReceptionistId());
        dto.setName(receptionist.getName());
        dto.setUsername(receptionist.getUsername());
        dto.setPassword(receptionist.getPassword());

        return dto;
    }
}
