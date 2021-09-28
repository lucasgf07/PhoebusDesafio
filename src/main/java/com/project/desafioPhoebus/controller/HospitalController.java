package com.project.desafioPhoebus.controller;

import com.project.desafioPhoebus.model.Hospital;
import com.project.desafioPhoebus.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;


    ///Retorna todos os hospitais
    @GetMapping(produces = "application/json")
    public @ResponseBody
    List<Hospital> getHospitais() {
        return hospitalService.findAll();
    }


    ///Retorna o hospital da Id referente ao parametro indicado
    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody
    Hospital getHospital(@PathVariable Long id) {
        return hospitalService.findById(id);
    }


    ///Cria um novo hospital
    @PostMapping(value = "/create")
    Hospital createHospital(@RequestBody Hospital hospital){
        return hospitalService.save(hospital);
    }


    ///Retorna hospitais com lotação maior ou igual a indicada no parametro
    @GetMapping(value = "/ocupacao/{valor}", produces = "application/json")
    public @ResponseBody
    List<Hospital> getOcupacao(@PathVariable int valor){
        return hospitalService.findByOcupacao(valor);
    }

    ///Retorna hospitais com ocupação acima de 90%
    @GetMapping(value = "/ocupacao", produces = "application/json")
    public @ResponseBody
    List<Hospital> getSuperLotacao(){
        return hospitalService.findSuperLotacao();
    }
}
