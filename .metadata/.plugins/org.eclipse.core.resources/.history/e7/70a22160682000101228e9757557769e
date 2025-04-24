package com.prajyot.hms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "appointments", schema = "public")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointmentid")
    private Integer appointmentId;

//    @ManyToOne
//    @JoinColumn(
//        name = "patientid", 
//        referencedColumnName = "patientid", 
//        foreignKey = @ForeignKey(name = "appointments_patientid_fkey")
//    )
    @Column(name = "patientid", nullable = false)
    private int patientId;

//    @ManyToOne
//    @JoinColumn(
//        name = "doctorid", 
//        referencedColumnName = "doctorid", 
//        foreignKey = @ForeignKey(name = "appointments_doctorid_fkey")
//    )
    @Column(name = "doctorid", nullable = false)
    private int doctorId;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    @Column(name = "status")
    private String status = "Pending"; // Default value

    @Column(name = "session", length = 20)
    private String session;

    // Getters and Setters

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
