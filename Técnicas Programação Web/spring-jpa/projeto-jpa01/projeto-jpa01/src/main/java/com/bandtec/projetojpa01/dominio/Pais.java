package com.bandtec.projetojpa01.dominio;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //transforma a classe em uma tabela, neste caso uma tabela país, está mapeando uma tabela do banco
public class Pais {
    @Id // transforma o atributo em PK - Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define o campo como valor auto_increment
    private Integer id;

    private String nome;
    private String continente;
    private Double idh;
    private Integer populacao;

    //Getter and setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Double getIdh() {
        return idh;
    }

    public void setIdh(Double idh) {
        this.idh = idh;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

}
