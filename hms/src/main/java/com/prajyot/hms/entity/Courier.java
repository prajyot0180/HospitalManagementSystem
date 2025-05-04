package com.prajyot.hms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "courier", schema = "public")
public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "courierid")
    private Integer courierId;

    @JoinColumn(name = "patientid")
    private Integer patientId;

    @JoinColumn(name = "medicineid")
    private Integer medicineId;

    @Column(name = "deliverydate")
    private LocalDate deliveryDate;

    @Column(name = "status")
    private String status = "Processing";  // Default value

    // Getters and Setters

    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatient(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicine(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
