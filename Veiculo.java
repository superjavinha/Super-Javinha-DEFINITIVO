package br.uefs.ecomp.programacao.model;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String tipo;
	private float hodometro;
	private String pneus;
	
	public Veiculo(String placa, String marca, String modelo, String tipo, float hodometro, String pneus) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.hodometro = hodometro;
		this.pneus = pneus;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getHodometro() {
		return hodometro;
	}
	public void setHodometro(float hodometro) {
		this.hodometro = hodometro;
	}
	public String getPneus() {
		return pneus;
	}
	public void setPneus(String pneus) {
		this.pneus = pneus;
	}

    @Override
    public String toString() {
        return "Placa: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + ",\nTipo: " + tipo + "\nHodometro: " + hodometro + "\nPneus: " + pneus;
    }
        
}
