package com.project.desafioPhoebus.values;

import org.springframework.stereotype.Service;

///Classe contendo os valores dos recursos para intercambio
@Service
public class IntercambioValues {

    private int medicoValue = 3;
    private int enfermeiroValue = 3;
    private int respiradorValue = 5;
    private int tomografoValue = 12;
    private int ambulanciaValue = 10;

    public int getMedicoValue() {
        return medicoValue;
    }

    public void setMedicoValue(int medicoValue) {
        this.medicoValue = medicoValue;
    }

    public int getEnfermeiroValue() {
        return enfermeiroValue;
    }

    public void setEnfermeiroValue(int enfermeiroValue) {
        this.enfermeiroValue = enfermeiroValue;
    }

    public int getRespiradorValue() {
        return respiradorValue;
    }

    public void setRespiradorValue(int respiradorValue) {
        this.respiradorValue = respiradorValue;
    }

    public int getTomografoValue() {
        return tomografoValue;
    }

    public void setTomografoValue(int tomografoValue) {
        this.tomografoValue = tomografoValue;
    }

    public int getAmbulanciaValue() {
        return ambulanciaValue;
    }

    public void setAmbulanciaValue(int ambulanciaValue) {
        this.ambulanciaValue = ambulanciaValue;
    }
}
