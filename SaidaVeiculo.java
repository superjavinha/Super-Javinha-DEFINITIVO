package br.uefs.ecomp.programacao.model;

public class SaidaVeiculo {
	private Veiculo veiculo;
	private Motorista motorista;
	private Empresa empresa;
	
        public SaidaVeiculo(Veiculo veiculo, Motorista motorista, Empresa empresa) {
		super();
		this.veiculo = veiculo;
		this.motorista = motorista;
		this.empresa = empresa;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
