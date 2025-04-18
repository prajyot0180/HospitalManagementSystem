package com.prajyot.hms.dto;

public class CheckupDTO {

    private Integer checkupId;
    private Integer appointmentId;
    private String symptoms;
    private String medicineGiven;
    private String testSuggested;

    // Getters and Setters

    public Integer getCheckupId() {
        return checkupId;
    }

    public void setCheckupId(Integer checkupId) {
        this.checkupId = checkupId;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getMedicineGiven() {
        return medicineGiven;
    }

    public void setMedicineGiven(String medicineGiven) {
        this.medicineGiven = medicineGiven;
    }

    public String getTestSuggested() {
        return testSuggested;
    }

    public void setTestSuggested(String testSuggested) {
        this.testSuggested = testSuggested;
    }
}
