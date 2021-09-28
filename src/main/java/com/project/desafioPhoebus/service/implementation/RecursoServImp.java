package com.project.desafioPhoebus.service.implementation;

import com.project.desafioPhoebus.model.Recurso;
import com.project.desafioPhoebus.repository.RecursoRepository;
import com.project.desafioPhoebus.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecursoServImp  implements RecursoService {

    @Autowired
    RecursoRepository repository;


    ///Método para listar todos os recursos
    @Override
    public List<Recurso> getAll() {
        return repository.findAll();
    }

    ///Método para buscar um recurso pelo Id
    @Override
    public Recurso findById(Long id) {
        return repository.findById(id).get();
    }

    ///Método para atualizar um recurso
    @Override
    public Recurso update(Recurso recurso, Long id) {
        Optional<Recurso> optional = repository.findById(id);

        if(optional.isPresent()){
            Recurso db = optional.get();
            db.setAmbulancia(recurso.getAmbulancia());
            db.setEnfermeiro(recurso.getEnfermeiro());
            db.setMedico(recurso.getMedico());
            db.setRespirador(recurso.getRespirador());
            db.setTomografo(recurso.getTomografo());
            return repository.save(db);
        }else{
            return null;
        }
    }

    ///Método para salvar um recurso
    @Override
    public Recurso save(Recurso recurso) {
        return repository.save(recurso);
    }
}
