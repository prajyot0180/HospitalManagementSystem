package com.prajyot.hms.dto;

public class ReceptionistDTO {

    private Integer receptionistId;
    private String name;
    private String username;
    private String password;

    // Getters and Setters

    public Integer getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(Integer receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
