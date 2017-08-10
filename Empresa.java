package br.uefs.ecomp.programacao.model;

public class Empresa {
	private String razaoSocial;
	private String CNPJ;
	private Endereco endereco;
	
	public Empresa(String razaoSocial, String cNPJ, Endereco endereco) {
		super();
		this.razaoSocial = razaoSocial;
		CNPJ = cNPJ;
		this.endereco = endereco;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return CNPJ;
	}
	public void setCnpj(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

    @Override
    public String toString() {
        return "Razão Social: " + razaoSocial + "\nCNPJ: " + CNPJ + "\nEndereco: " + endereco;
    }
}