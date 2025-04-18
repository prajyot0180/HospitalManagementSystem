package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Courier;
import com.prajyot.hms.dto.CourierDTO;

public class CourierMapper {

    // Method to convert Courier entity to CourierDTO
    public static CourierDTO toDTO(Courier courier) {
        if (courier == null) {
            return null;
        }

        CourierDTO courierDTO = new CourierDTO();
        courierDTO.setCourierId(courier.getCourierId());
        courierDTO.setPatientId(courier.getPatient() != null ? courier.getPatient().getPatientId() : null);
        courierDTO.setMedicineId(courier.getMedicine() != null ? courier.getMedicine().getMedicineId() : null);
        courierDTO.setDeliveryDate(courier.getDeliveryDate());
        courierDTO.setStatus(courier.getStatus());

        return courierDTO;
    }

 
}
