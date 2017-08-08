package br.uefs.ecomp.programacao.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private String funcao;
    private float salario;

    public Funcionario(String funcao, float salario, String nome, String cPF, LocalDate dataNascimento, Endereco endereco) {
        super(nome, cPF, dataNascimento, endereco);
        this.funcao = funcao;
        this.salario = salario;
    }
	
    public String getFuncao() {
	return funcao;
    }
    public void setFuncao(String funcao) {
	this.funcao = funcao;
    }
    public float getSalario() {
	return salario;
    }
    public void setSalario(float salario) {
	this.salario = salario;
    }
}