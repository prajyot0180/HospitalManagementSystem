package com.prajyot.hms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "test", schema = "public")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "testid")
    private Integer testId;

    @Column(name = "patientid")
    private Integer patientId;

    @Column(name = "testname", nullable = false)
    private String testName;

    @Column(name = "datescheduled", nullable = false)
    private LocalDate dateScheduled;

    // Getters and Setters

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatient(int patientId) {
        this.patientId = patientId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public LocalDate getDateScheduled() {
        return dateScheduled;
    }

    public void setDateScheduled(LocalDate dateScheduled) {
        this.dateScheduled = dateScheduled;
    }
}
