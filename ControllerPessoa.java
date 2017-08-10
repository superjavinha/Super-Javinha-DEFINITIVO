package br.uefs.ecomp.programacao.controller;

import br.uefs.ecomp.programacao.model.Endereco;
import br.uefs.ecomp.programacao.model.Funcionario;
import br.uefs.ecomp.programacao.model.Motorista;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Classe responsável por administrar as informações das classes que herdam de Pessoa,a saber Funcionario e Motorista.
 * @author Eduardo, Victor, Ananias, Daniel.
 */
public class ControllerPessoa {
    LinkedList<Funcionario> listaFuncionario = new LinkedList<>();
    LinkedList<Motorista> listaMotorista = new LinkedList<>();
    
    /**
     * Método responsável por cadastrar um funcionario no sistema.
     * @param funcao - Função de trabalho.
     * @param salario - valor do salario.
     * @param nome - Nome do Funcionário.
     * @param cpf - CPF do Funcionario.
     * @param sexo Sexo do Funcionario.
     * @param dataNascimento - Data de nascimento do Funcionario.
     * @param endereco - Endereço do Funcionário.
     * @return retorna uma instancia do funcionário cadastrado.
     */
    public Funcionario cadastrarFuncionario(String funcao, float salario, String nome, String cpf, String sexo, LocalDate dataNascimento, Endereco endereco){
        Funcionario f = new Funcionario(funcao, salario, nome, cpf, sexo, dataNascimento, endereco);
        listaFuncionario.add(f);
        return f;
    }
    
    /**
     * Método que remove um funcionário do sistema através do seu CPF.
     * @param CPF - CPF do funcionário.
     * @return retorna true caso o funcionário seja removido com sucesso e false caso contrário.
     */
    public boolean removerFuncionario(String CPF){
        Funcionario f = obterFuncionario(CPF);
        boolean remove = listaFuncionario.remove(f);
        return remove;
    }
    
    /**
     * Método Método responsável por buscar um funcionário no sistema através do CPF.
     * @param CPF
     * @return retorna o objeto do funcionário ou null caso não encontre o funcionário.
     */
    public Funcionario obterFuncionario(String CPF){
       Iterator itr = listaFuncionario.iterator();
        while (itr.hasNext()) {
            Funcionario f = (Funcionario) itr.next();
            if (f.getCPF().equalsIgnoreCase(CPF)) {
                return f;
            }
        }
        return null;
    }
    
    /**
     * Iterador para percorrer a lista de funcionários.
     * @return retorna um iterador da lista de funcionários.
     */
    public Iterator iteradorFuncionario(){
        return listaFuncionario.iterator();
    }
    
    /**
     * Método de cadastro de um motorista no sistema.
     * @param CNH - Cateira de Habilitação.
     * @param nome
     * @param CPF
     * @param dataNascimento
     * @param endereco
     * @return retorna um objeto do tipo motorista que foi cadastrado.
     */
    public Motorista cadastrarMotorista(String CNH, String nome, String CPF, String sexo, LocalDate dataNascimento, Endereco endereco){
        Motorista m = new Motorista(CNH, nome, CPF, sexo, dataNascimento, endereco);
        listaMotorista.add(m);
        return m;
    }
    
    /**
     * Método que remove um motorista do sistema através do seu CPF.
     * @param CPF
     * @return retorna true caso o motorista seja removido com sucesso e false caso contrário.
     */
    public boolean removerMotorista(String CPF){
        Motorista m = obterMotorista(CPF);
        boolean remove = listaMotorista.remove(m);
        return remove;
    }
    
    /**
     * Método que busca qualquer motorista cadastrado no sistema através do seu CPF.
     * @param CPF
     * @return retorna o objeto do tipo motorista caso seja encontrado no sistema ou null caso contrário.
     */
    public Motorista obterMotorista(String CPF){
        Iterator itr = listaMotorista.iterator();
        while (itr.hasNext()) {
            Motorista m = (Motorista) itr.next();
            if (m.getCPF().equalsIgnoreCase(CPF)) {
                return m;
            }
        }
        return null;
    }
    
    /**
     * Método para percorrer a lista de motoristas.
     * @return retorna um iterador para percorrer a lista de motoristas.
     */
    public Iterator iteradorMotorista(){
        return listaMotorista.iterator();
    }
}