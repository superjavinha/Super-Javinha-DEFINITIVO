package br.uefs.ecomp.programacao.model;

import java.time.LocalDate;

public abstract class Pessoa {
	private String nome;
	private String CPF;
        private String sexo;
	private LocalDate dataNascimento;
	private Endereco endereco;

    public Pessoa(String nome, String CPF, String sexo, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
        

    public String toStringPessoa() {
        return "Nome: " + nome + "\nCPF: " + CPF + "\nSexo: " + sexo + "\nData de Nascimento: " + dataNascimento + "\nEndereço: " + endereco;
    }
        
}
