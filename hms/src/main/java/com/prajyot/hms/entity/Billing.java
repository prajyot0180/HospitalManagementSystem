package com.prajyot.hms.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "billing", schema = "public")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billid")
    private Integer billId;

    @ManyToOne
    @JoinColumn(name = "patientid", referencedColumnName = "patientid", foreignKey = @ForeignKey(name = "billing_patientid_fkey"))
    private Patient patient;

    @Column(name = "amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "paymentmode", nullable = false)
    private String paymentMode;

    @Column(name = "status")
    private String status = "Pending";  // Default value

    // Getters and Setters

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

