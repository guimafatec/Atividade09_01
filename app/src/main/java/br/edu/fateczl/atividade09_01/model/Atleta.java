package br.edu.fateczl.atividade09_01.model;

import java.util.Date;

public abstract class Atleta {
    private String nome;
    private Date dtNascimento;
    private String bairro;
    public Atleta(String nome, Date dtNascimento, String bairro) {
        this.setNome(nome);
        this.setDtNascimento(dtNascimento);
        this.setBairro(bairro);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


}
