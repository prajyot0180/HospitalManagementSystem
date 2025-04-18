package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Checkup;
import com.prajyot.hms.dto.CheckupDTO;

public class CheckupMapper {

    public static CheckupDTO toDTO(Checkup checkup) {
        if (checkup == null) {
            return null;
        }

        CheckupDTO checkupDTO = new CheckupDTO();
        checkupDTO.setCheckupId(checkup.getCheckupId());
        checkupDTO.setAppointmentId(checkup.getAppointment() != null ? checkup.getAppointment().getAppointmentId() : null);
        checkupDTO.setSymptoms(checkup.getSymptoms());
        checkupDTO.setMedicineGiven(checkup.getMedicineGiven());
        checkupDTO.setTestSuggested(checkup.getTestSuggested());

        return checkupDTO;
    }

}
