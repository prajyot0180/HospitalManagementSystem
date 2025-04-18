package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Medicine;
import com.prajyot.hms.dto.MedicineDTO;

public class MedicineMapper {

    // Method to convert Medicine entity to MedicineDTO
    public static MedicineDTO toDTO(Medicine medicine) {
        if (medicine == null) {
            return null;
        }

        MedicineDTO medicineDTO = new MedicineDTO();
        medicineDTO.setMedicineId(medicine.getMedicineId());
        medicineDTO.setName(medicine.getName());
        medicineDTO.setPrice(medicine.getPrice());
        medicineDTO.setSymptoms(medicine.getSymptoms());
        medicineDTO.setStockAvailable(medicine.getStockAvailable());

        return medicineDTO;
    }
}
