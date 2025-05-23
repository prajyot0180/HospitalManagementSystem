package com.prajyot.hms.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "family", schema = "public")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "familycode")
    private Integer familyCode;

    @Column(name = "relationship")
    private String relationship;

    @OneToOne
    @JoinColumn(name = "familyhead", referencedColumnName = "patientid", foreignKey = @ForeignKey(name = "family_familyhead_fkey"))
    @JsonIgnoreProperties("family")
    private Patient familyHead;

	public Integer getFamilyCode() {
		return familyCode;
	}

	public void setFamilyCode(Integer familyCode) {
		this.familyCode = familyCode;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Patient getFamilyHead() {
		return familyHead;
	}

	public void setFamilyHead(Patient familyHead) {
		this.familyHead = familyHead;
	}
    
    
}