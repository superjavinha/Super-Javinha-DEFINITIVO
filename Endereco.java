package br.uefs.ecomp.programacao.model;

public class Endereco {
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(String logradouro, String numero, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public String getRua() {
		return logradouro;
	}
	public void setRua(String rua) {
		this.logradouro = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

    @Override
    public String toString() {
        return "Logradouro: " + logradouro + ", Número: " + numero + ", Bairro: " + bairro + ", Cidade: " + cidade + "-" + estado;
    }
        
}