package br.edu.fateczl.atividade09_01.model;

import java.util.Date;

public class AtletaSenior extends Atleta{
    private boolean probCardiaco;
    public AtletaSenior(String nome, Date dtNascimento, String bairro, boolean probCardiaco) {
        super(nome, dtNascimento, bairro);
        this.setProbCardiaco(probCardiaco);
    }

    public boolean isProbCardiaco() {
        return probCardiaco;
    }

    public void setProbCardiaco(boolean probCardiaco) {
        this.probCardiaco = probCardiaco;
    }
}
