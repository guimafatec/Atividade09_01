package br.edu.fateczl.atividade09_01.model;

import java.util.Date;

public class AtletaOutros extends Atleta{
    private String academia;
    private int recordeSegundos;
    public AtletaOutros(String nome, Date dtNascimento, String bairro, String academia, int recordeSegundos) {
        super(nome, dtNascimento, bairro);
        this.setAcademia(academia);
        this.setRecordeSegundos(recordeSegundos);
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public int getRecordeSegundos() {
        return recordeSegundos;
    }

    public void setRecordeSegundos(int recordeSegundos) {
        this.recordeSegundos = recordeSegundos;
    }
}
