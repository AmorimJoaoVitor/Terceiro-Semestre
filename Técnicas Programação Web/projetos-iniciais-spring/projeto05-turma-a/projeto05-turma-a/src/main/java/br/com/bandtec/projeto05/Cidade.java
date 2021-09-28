package br.com.bandtec.projeto05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cidade {

    private int id;
    private String nome;
    private int populacao;
    private boolean capital;
    private Estado estado;
    private List<String> pontosTuristicos = new ArrayList<>();
    private LocalDate fundacao; // formato: 'aaaa-mm-dd'

    public Cidade() {
    }

    public Cidade(int id, String nome, int populacao, boolean capital, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.populacao = populacao;
        this.capital = capital;
        this.estado = estado;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public List<String> getPontosTuristicos() {
        return pontosTuristicos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public boolean isCapital() {
        return capital;
    }
}
