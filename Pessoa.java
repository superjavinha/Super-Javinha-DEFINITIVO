package br.uefs.ecomp.programacao.model;

import java.time.LocalDate;

public abstract class Pessoa {
	private String nome;
	private String CPF;
        private String sexo;
	private LocalDate dataNascimento;
	private Endereco endereco;
	
        public Pessoa(String nome, String cPF, LocalDate dataNascimento, Endereco endereco) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
