package com.prajyot.hms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "checkup", schema = "public")
public class Checkup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "checkupid")
    private Integer checkupId;

    @ManyToOne
    @JoinColumn(
        name = "appointmentid",
        referencedColumnName = "appointmentid",
        foreignKey = @ForeignKey(name = "checkup_appointmentid_fkey")
    )
    private Appointment appointment;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "medicinegiven")
    private String medicineGiven;

    @Column(name = "testsuggested")
    private String testSuggested;

    // Getters and Setters

    public Integer getCheckupId() {
        return checkupId;
    }

    public void setCheckupId(Integer checkupId) {
        this.checkupId = checkupId;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
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
