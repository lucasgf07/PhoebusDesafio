package com.project.desafioPhoebus.service;

import com.project.desafioPhoebus.model.Hospital;

import java.util.List;

public interface HospitalService {
    Hospital save(Hospital hospital);
    Hospital update(Hospital hospital, Long id);
    Hospital findById(Long id);
    List<Hospital> findAll();
    void delete(Hospital hospital);
    List<Hospital> findByOcupacao(int ocupacao);
    List<Hospital> findSuperLotacao();
}
