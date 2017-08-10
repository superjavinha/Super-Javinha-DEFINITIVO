package br.uefs.ecomp.programacao.model;

public class Equipamentos {
    private String nome;
    private String tipo;
    private int id;

    public Equipamentos(String nome, String tipo, int id) {
        this.nome = nome;
        this.tipo = tipo;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTipo: " + tipo + "\nID: " + id;
    }
}