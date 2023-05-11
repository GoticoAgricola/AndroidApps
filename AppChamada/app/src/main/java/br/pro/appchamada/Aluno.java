package br.pro.appchamada;

import androidx.annotation.NonNull;

public class Aluno {

    private int id;
    private String nome, ra;

    public Aluno() {

    }

    public Aluno(int id, String nome, String ra) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
    }


    @NonNull
    @Override
    public String toString() {
        return nome + " - RA: " + ra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
