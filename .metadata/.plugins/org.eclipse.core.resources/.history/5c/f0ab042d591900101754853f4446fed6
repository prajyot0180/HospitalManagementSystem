package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Family;
import com.prajyot.hms.dto.FamilyDTO;

public class FamilyMapper {

    // Method to convert Family entity to FamilyDTO
    public static FamilyDTO toDTO(Family family) {
        if (family == null) {
            return null;
        }

        FamilyDTO familyDTO = new FamilyDTO();
        familyDTO.setFamilyCode(family.getFamilyCode());
        familyDTO.setRelationship(family.getRelationship());
        familyDTO.setFamilyHeadId(family.getFamilyHead() != null ? family.getFamilyHead().getPatientId() : null);

        return familyDTO;
    }
}
