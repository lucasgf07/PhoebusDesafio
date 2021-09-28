package com.project.desafioPhoebus.model;

import javax.persistence.*;

///Tabela referente a entidade Hospital
///Renomeada para manter padrão
@Entity
@Table(name = "TB_HOSPITAL")
public class Hospital {

    ///Atributo de identificação "ID"
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String nome;

    ///Atributo cnpj - característica: deve ser único
    @Column(unique = true)
    private String cnpj;

    private  int ocupacao;

    ///Mapeamento OneToOne com o objeto Endereco
    @OneToOne(mappedBy = "hospital", cascade = CascadeType.ALL)
    private Endereco endereco;

    ///Mapeamento OneToOne com o objeto Recurso
    @OneToOne(mappedBy = "hospital", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Recurso recurso;


    ///Getters && Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(int ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
}
