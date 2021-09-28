package com.project.desafioPhoebus.service;

import com.project.desafioPhoebus.model.Recurso;

import java.util.List;

public interface RecursoService {
    List<Recurso> getAll();
    Recurso findById(Long id);
    Recurso update(Recurso recurso, Long id);
    Recurso save(Recurso recurso);
}
