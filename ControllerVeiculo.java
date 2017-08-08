package br.uefs.ecomp.programacao.controller;

import br.uefs.ecomp.programacao.model.Equipamentos;
import br.uefs.ecomp.programacao.model.Veiculo;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Classe controladora responsável por administrar as informações das classes Veiculo e Equipamentos.
 * @author Eduardo, Victor, Ananias, Daniel.
 */
public class ControllerVeiculo {
    LinkedList<Veiculo> listaVeiculo = new LinkedList<>();
    LinkedList<Equipamentos> listaEquipamentos = new LinkedList<>();
    
    /**
     * Método de cadastro de veículos.
     * @param placa
     * @param marca
     * @param modelo
     * @param tipo
     * @param hodometro
     * @param pneus
     * @return 
     */
    public Veiculo cadastrarVeiculo(String placa, String marca, String modelo, String tipo, float hodometro, String pneus){
        Veiculo v = new Veiculo(placa, marca, modelo, tipo, hodometro, pneus);
        listaVeiculo.add(v);
        return v;
    }
    
    /**
     * Método para obter um veículo da lista e retorna o objeto ou null caso não encontre.
     * @param placa - utiliza da placa do veículo para encontra-lo na lista.
     * @return objeto do veículo procurado ou null se o veículo não estiver na lista.
     */
    //Método também utilizado para a remorção e alteração de qualquer veículo cadastrado.
    public Veiculo obterVeiculo(String placa){
        Iterator itr = listaVeiculo.iterator();
        while (itr.hasNext()) {
            Veiculo v = (Veiculo) itr.next();
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }
    /**
     * Método que remove um veículo da lista, através da placa do veículo.
     * @param placa
     * @return retorna true caso o veículo for encontrado e removido com sucesso e false caso contrario.
     */
    public boolean removerVeiculo(String placa){
        Veiculo v = obterVeiculo(placa);
        boolean remove = listaVeiculo.remove(v);
        return remove;
    }
    
    /**
     * Método que retorna o iterador da lista de veículos.
     * @return Iterador da lista de véiculos.
     */
    public Iterator iteradorVeiculo(){
        return listaVeiculo.iterator();
    }
    
    /**
     * Método que adiciona um equipamento na lista.
     * @param nome - nome do equipamento.
     * @param tipo - Tipo do equipamento.
     * @param id - identificação unica para cada equipamento.
     * @return retorna uma instancia do equipamento cadastrado.
     */
    public Equipamentos cadastrarEquipamento(String nome, String tipo, int id){
        Equipamentos e = new Equipamentos(nome, tipo, id);
        listaEquipamentos.add(e);
        return e;
    }
    
    /**
     * Método que busca o equipamento cadastrado no sistema através da identificação.
     * @param id - Identificação do equipamento.
     * @return retorna o equipamento, caso encontrado, e null caso contrario.
     */
    public Equipamentos obterEquipamentos(int id){
        Iterator itr = listaEquipamentos.iterator();
        while (itr.hasNext()) {
            Equipamentos e = (Equipamentos) itr.next();
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
    /**
     * Método que remove um equipamento do sistema através de sua identificação.
     * @param id - identificação do equipamento.
     * @return - retorna true quando o equipamento for removido com sucesso e false caso equipamento não seja encontrado.
     */
    public boolean removerEquipamentos(int id){
        Equipamentos e = obterEquipamentos(id);
        boolean remove = listaEquipamentos.remove(e);
        return remove;
    }
    
    /**
     * Retorna o iterador da lista de equipamentos.
     * @return  Iterador da lista de Equipamentos.
     */
    public Iterator iteradorEquipamentos(){
        return listaEquipamentos.iterator();
    }
}