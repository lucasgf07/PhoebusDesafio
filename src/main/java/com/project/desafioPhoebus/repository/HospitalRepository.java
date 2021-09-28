package com.project.desafioPhoebus.repository;

import com.project.desafioPhoebus.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
