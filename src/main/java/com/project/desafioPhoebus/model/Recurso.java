package com.project.desafioPhoebus.model;

import javax.persistence.*;

///Tabela referente a entidade Endereco
///Renomeada para manter padrão
@Entity
@Table(name = "TB_RECURSO")
public class Recurso {

    ///Atributo de identificação "ID"
    @Id
    @Column(name = "hospital_id")
    private Long id;

    private int medico;
    private int enfermeiro;
    private int respirador;
    private int tomografo;
    private int ambulancia;


    ///Mapeamento OneToOne com o objeto Hospital
    @OneToOne
    @MapsId
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMedico() {
        return medico;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }

    public int getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(int enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public int getRespirador() {
        return respirador;
    }

    public void setRespirador(int respirador) {
        this.respirador = respirador;
    }

    public int getTomografo() {
        return tomografo;
    }

    public void setTomografo(int tomografo) {
        this.tomografo = tomografo;
    }

    public int getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(int ambulancia) {
        this.ambulancia = ambulancia;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
