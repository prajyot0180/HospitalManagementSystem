package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Test;
import com.prajyot.hms.dto.TestDTO;

public class TestMapper {

    // Method to convert Test entity to TestDTO
    public static TestDTO toDTO(Test test) {
        if (test == null) {
            return null;
        }

        TestDTO dto = new TestDTO();
        dto.setTestId(test.getTestId());
        if (test.getPatient() != null) {
            dto.setPatientId(test.getPatient().getPatientId()); // Storing only the patientId
        }
        dto.setTestName(test.getTestName());
        dto.setDateScheduled(test.getDateScheduled());

        return dto;
    }
}
