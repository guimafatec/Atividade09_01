package br.edu.fateczl.atividade09_01.model;

import java.util.Date;

public class AtletaJuvenil extends Atleta{
    private int anosPratica;
    public AtletaJuvenil(String nome, Date dtNascimento, String bairro, int anosPratica) {
        super(nome, dtNascimento, bairro);
        this.setAnosPratica(anosPratica);
    }
    public int getAnosPratica() {
        return anosPratica;
    }

    public void setAnosPratica(int anosPratica) {
        this.anosPratica = anosPratica;
    }

}
