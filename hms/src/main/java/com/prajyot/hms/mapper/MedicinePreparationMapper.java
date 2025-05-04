package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.MedicinePreparation;
import com.prajyot.hms.dto.MedicinePreparationDTO;

public class MedicinePreparationMapper {

    // Method to convert MedicinePreparation entity to MedicinePreparationDTO
    public static MedicinePreparationDTO toDTO(MedicinePreparation medicinePreparation) {
        if (medicinePreparation == null) {
            return null;
        }
        MedicinePreparationDTO dto = new MedicinePreparationDTO();
        dto.setPrepId(medicinePreparation.getPrepId());
        dto.setMedicineId(medicinePreparation.getMedicineId());  // Reference to the Medicine entity
        dto.setDoses(medicinePreparation.getDoses());
        dto.setStatus(medicinePreparation.getStatus());

        return dto;
    }
}
