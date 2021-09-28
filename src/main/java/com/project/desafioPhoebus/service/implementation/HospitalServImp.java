package com.project.desafioPhoebus.service.implementation;

import com.project.desafioPhoebus.model.Hospital;
import com.project.desafioPhoebus.model.Recurso;
import com.project.desafioPhoebus.repository.HospitalRepository;
import com.project.desafioPhoebus.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class HospitalServImp implements HospitalService {

    @Autowired
    HospitalRepository repository;

    @Autowired
    EntityManager em;

    ///Metodo para salvar um novo hospital
    @Override
    public Hospital save(Hospital hospital) {
        return repository.save(hospital);
    }

    ///Metodo para atualizar um hospital
    @Override
    public Hospital update(Hospital hospital, Long id) {
        Optional<Hospital> optional = repository.findById(id);

        if(optional.isPresent()){
            Hospital db = optional.get();
            db.setNome(hospital.getNome());
            db.setCnpj(hospital.getCnpj());
            db.setEndereco(hospital.getEndereco());
            db.setOcupacao(hospital.getOcupacao());
            return repository.save(db);
        }else{
            return null;
        }
    }

    ///Metodo para buscar um hospital pelo Id
    @Override
    public Hospital findById(Long id) {
        return repository.findById(id).get();
    }

    ///Método para listar todos os hospitais cadastrados
    @Override
    public List<Hospital> findAll() {
        return repository.findAll();
    }

    ///Método para excluir um hospital
    @Override
    public void delete(Hospital hospital) {
        repository.delete(hospital);
    }

    ///Método para listar hospitais com acupação acima da solicitada pelo parametro
    @Override
    public List<Hospital> findByOcupacao(int ocupacao) {
        String jpql = "SELECT h FROM Hospital h WHERE h.ocupacao >= :pOcupacao";
        Query query = em.createQuery(jpql);
        query.setParameter("pOcupacao", ocupacao);
        List<Hospital> hospitals = query.getResultList();
        return  hospitals;
    }


    ///Método para listar todos os hospitais com lotação acima de 90%
    @Override
    public List<Hospital> findSuperLotacao() {
        String jpql = "SELECT h FROM Hospital h WHERE h.ocupacao >= 90";
        Query query = em.createQuery(jpql);
        List<Hospital> hospitals = query.getResultList();
        return  hospitals;
    }

}
