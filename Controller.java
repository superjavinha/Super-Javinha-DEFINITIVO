package br.uefs.ecomp.programacao.controller;

import br.uefs.ecomp.programacao.model.Empresa;
import br.uefs.ecomp.programacao.model.Endereco;
import br.uefs.ecomp.programacao.model.NotaFiscal;
import br.uefs.ecomp.programacao.model.SaidaVeiculo;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Classe responsável por administrar as classes Empresa, NotaFiscal e SaidaVeiculo.
 * @author Eduardo Marques
 */
public class Controller {
    LinkedList<Empresa> listaEmpresa = new LinkedList<>();
    LinkedList<NotaFiscal> listaNotaFiscal = new LinkedList<>();
    LinkedList<SaidaVeiculo> listaSaidaVeiculo = new LinkedList<>();
    
    /**
     * Método responsável por cadastrar uma empresa no sistema.
     * @param razaoSocial
     * @param CNPJ
     * @param endereco
     * @return retorna o objeto da empresa que foi cadastrada.
     */
    public Empresa cadastrarEmpresa(String razaoSocial, String CNPJ, Endereco endereco){
        Empresa e = new Empresa(razaoSocial, CNPJ, endereco);
        listaEmpresa.add(e);
        return e;
    }
    
    /**
     * Método que busca qualquer empresa cadastrada no sistema através do CNPJ da empresa.
     * @param CNPJ
     * @return retorna o objeto da empresa encontrada ou null caso a empresa não esteja cadastrada no sistema.
     */
    public Empresa obterEmpresa(String CNPJ){
        Iterator itr = listaEmpresa.iterator();
        while (itr.hasNext()) {
            Empresa e = (Empresa) itr.next();
            if (e.getCnpj().equalsIgnoreCase(CNPJ)) {
                return e;
            }
        }
        return null;
    }
    
    /**
     * Método que remove o cadastro de uma empresa do sistema através do CNPJ.
     * @param CNPJ
     * @return retorna true caso a empresa seja removida com sucesso ou false caso contrário.
     */
    public boolean removeEmpresa(String CNPJ){
        Empresa e = obterEmpresa(CNPJ);
        boolean remove = listaEmpresa.remove(e);
        return remove;
    }
    
    /**
     * Método para percorrer a lista de empresas cadastradas no sistema.
     * @return retorna o iterador da lista de empresas.
     */
    public Iterator iterador(){
        return listaEmpresa.iterator();
    }
}
