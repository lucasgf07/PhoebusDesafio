package com.project.desafioPhoebus.model;

import javax.persistence.*;

///Tabela referente a entidade Endereco
///Renomeada para manter padrão
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {

    ///Atributo de identificação "ID"
    @Id
    @Column(name = "hospital_id")
    private Long id;
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;
    private String estado;
    private String latitude;
    private String longitude;

    ///Mapeamento OneToOne com o objeto Hospital
    @OneToOne
    @MapsId
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;


    ///Getters && Setters
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
