package br.uefs.ecomp.programacao.controller;

import br.uefs.ecomp.programacao.model.Empresa;
import br.uefs.ecomp.programacao.model.Endereco;
import br.uefs.ecomp.programacao.model.Motorista;
import br.uefs.ecomp.programacao.model.NotaFiscal;
import br.uefs.ecomp.programacao.model.SaidaVeiculo;
import br.uefs.ecomp.programacao.model.Veiculo;
import java.time.LocalDate;
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
    int numNotaFiscal = 0;
    
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
    public Iterator iteradorEmpresa(){
        return listaEmpresa.iterator();
    }
    
    /**
     * Método de cadastro de saida de véiculo.
     * @param v Objeto veículo
     * @param m Objeto do motorista
     * @param e Objeto da Empresa
     * @return retorna um objeto do tipo SaidaVeiculo após o cadastro.
     */
    public SaidaVeiculo cadastrarSaidaDeVeiculo(Veiculo v, Motorista m, Empresa e){
        SaidaVeiculo s = new SaidaVeiculo(v,m,e);
        listaSaidaVeiculo.add(s);
        return s;
    }
    
    /**
     * Método que busca na lista qualquer cadastro de saida de veículo através da placa do carro.
     * @param placa Placa do veículo.
     * @return retorna o objeto caso encontrado e null caso contrário.
     */
    public SaidaVeiculo obterSaidaVeiculo(String placa){
        Iterator itr = listaSaidaVeiculo.iterator();
        while (itr.hasNext()) {
            SaidaVeiculo s = (SaidaVeiculo) itr.next();
            if (s.getVeiculo().getPlaca().equalsIgnoreCase(placa)) {
                return s;
            }
        }
        return null;
    }
    
    /**
     * Método responsável por remover do sistema a saída de um veículo.
     * @param placa Placa do véiculo.
     * @return retorna true caso a remorção seja efetuada com sucesso ou false caso contrário.
     */
    public boolean removeSaidaVeiculo(String placa){
        SaidaVeiculo sv = obterSaidaVeiculo(placa);
        boolean remove = listaSaidaVeiculo.remove(sv);
        return remove;
    }
    
    /**
     * Iterador para percorrer a lista de Saida de Veiculos.
     * @return Iterador listaSaidaVeiculo.
     */
    public Iterator iteradorSaidaVeiculo(){
        return listaSaidaVeiculo.iterator();
    }
    
    /**
     * Método responsável por cadastrar nota fiscal de um abastecimento.
     * @param data Data do abastecimento.
     * @param quantLitros Quantidade de litros abastecidos.
     * @param veiculoDestino Veículo que foi abastecido.
     * @return retorna o objeto cadastrado na lista de nota fiscal.
     */
    public NotaFiscal cadastrarNota(LocalDate data, float quantLitros, Veiculo veiculoDestino){
        this.numNotaFiscal++;
        NotaFiscal nf = new NotaFiscal(numNotaFiscal, data, quantLitros, veiculoDestino);
        listaNotaFiscal.add(nf);
        return nf;
    }
    
    /**
     * Método que busca qualquer nota fiscal cadastrada no sistema através do seu id.
     * @param numNotaFiscal ID da nota fiscal.
     * @return retorna o objeto procurado ou null caso não seja encontrado.
     */
    public NotaFiscal obterNotaFiscal(int numNotaFiscal){
        Iterator itr = listaNotaFiscal.iterator();
        while (itr.hasNext()) {
            NotaFiscal nf = (NotaFiscal) itr.next();
            if (nf.getNumNota() == numNotaFiscal) {
                return nf;
            }
        }
        return null;
    }
    
    /**
     * Método que remove qualquer nota cadastada no sistema.
     * @param numNotaFiscal ID da nota fiscal.
     * @return Retorna true caso seja removida com sucesso e false caso contrário.
     */
    public boolean removerNotaFiscal(int numNotaFiscal){
        NotaFiscal nf = obterNotaFiscal(numNotaFiscal);
        boolean remove = listaNotaFiscal.remove(nf);
        return remove;
    }
    
    /**
     * Método que retorna o iterador da lista de notas fiscais.
     * @return Retorna iterador da lista.
     */
    public Iterator iterador(){
        return listaNotaFiscal.iterator();
    }
}
