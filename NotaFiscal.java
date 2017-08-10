package br.uefs.ecomp.programacao.model;

import java.time.LocalDate;

public class NotaFiscal {
	private int numNota;
	private LocalDate Data;
	private float quantLitros;
	private	Veiculo veiculoDestino;
	
	public NotaFiscal(int numNota, LocalDate data, float quantLitros, Veiculo veiculoDestino) {
		super();
		this.numNota = numNota;
		Data = data;
		this.quantLitros = quantLitros;
		this.veiculoDestino = veiculoDestino;
	}
	public int getNumNota() {
		return numNota;
	}
	public void setNumNota(int numNota) {
		this.numNota = numNota;
	}
	public LocalDate getData() {
		return Data;
	}
	public void setData(LocalDate data) {
		Data = data;
	}
	public float getQuantLitros() {
		return quantLitros;
	}
	public void setQuantLitros(float quantLitros) {
		this.quantLitros = quantLitros;
	}
	public Veiculo getVeiculoDestino() {
		return veiculoDestino;
	}
	public void setVeiculoDestino(Veiculo veiculoDestino) {
		this.veiculoDestino = veiculoDestino;
	}

    @Override
    public String toString() {
        return "Numero da Nota: " + numNota + "\nData=" + Data + "\nQuantidade de Litros: " + quantLitros + "\nVeiculo Destino:" + veiculoDestino;
    }
}
