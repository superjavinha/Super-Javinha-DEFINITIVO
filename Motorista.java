package br.uefs.ecomp.programacao.model;

import java.time.LocalDate;

public class Motorista extends Pessoa {
    private String CNH;

    public Motorista(String CNH, String nome, String CPF, String sexo, LocalDate dataNascimento, Endereco endereco) {
        super(nome, CPF, sexo, dataNascimento, endereco);
        this.CNH = CNH;
    }

    public String getCNH() {
	return CNH;
    }
    
    public void setCNH(String cNH) {
	CNH = cNH;
    }	

    @Override
    public String toString() {
        return "CNH: " + CNH;
    }
}