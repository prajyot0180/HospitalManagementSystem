package com.prajyot.hms.mapper;

import com.prajyot.hms.entity.Billing;
import com.prajyot.hms.dto.BillingDTO;

public class BillingMapper {

    // Method to convert Billing entity to BillingDTO
    public static BillingDTO toDTO(Billing billing) {
        if (billing == null) {
            return null;
        }

        BillingDTO billingDTO = new BillingDTO();
        billingDTO.setBillId(billing.getBillId());
        billingDTO.setPatientId(billing.getPatientId());// != null ? billing.getPatient().getPatientId() : null);
        billingDTO.setAmount(billing.getAmount());
        billingDTO.setPaymentMode(billing.getPaymentMode());
        billingDTO.setStatus(billing.getStatus());

        return billingDTO;
    }

}
