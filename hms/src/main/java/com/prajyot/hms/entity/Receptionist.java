package com.prajyot.hms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "receptionist", schema = "public")
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receptionistid")
    private Integer receptionistId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

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
