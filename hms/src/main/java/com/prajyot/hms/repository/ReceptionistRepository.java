package com.prajyot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prajyot.hms.entity.Receptionist;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist, Integer>{
	

}
