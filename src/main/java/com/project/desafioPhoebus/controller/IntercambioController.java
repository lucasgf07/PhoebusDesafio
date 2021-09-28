package com.project.desafioPhoebus.controller;

import com.project.desafioPhoebus.model.Recurso;
import com.project.desafioPhoebus.service.RecursoService;
import com.project.desafioPhoebus.values.IntercambioValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/recurso")
public class IntercambioController {

    @Autowired
    private RecursoService recursoService;

    @Autowired
    private IntercambioValues values;


    ///Retorna o valor total de intercambio de recursos
    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody
    int getRecurso(@PathVariable Long id){
        Recurso recurso = recursoService.findById(id);
        int recursoValue = 0;
        recursoValue += recurso.getAmbulancia()*values.getAmbulanciaValue();
        recursoValue += recurso.getEnfermeiro()*values.getEnfermeiroValue();
        recursoValue += recurso.getMedico()* values.getMedicoValue();
        recursoValue += recurso.getRespirador()* values.getRespiradorValue();
        recursoValue += recurso.getTomografo()* values.getTomografoValue();

        return recursoValue;
    }
}
