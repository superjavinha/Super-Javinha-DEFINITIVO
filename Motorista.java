package br.uefs.ecomp.programacao.model;

import java.time.LocalDate;

public class Motorista extends Pessoa {
    private String CNH;

    public Motorista(String CNH, String nome, String cPF, LocalDate dataNascimento, Endereco endereco) {
        super(nome, cPF, dataNascimento, endereco);
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
        return "Motorista{" + "CNH=" + CNH + '}';
    }
}