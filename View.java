package br.uefs.ecomp.programacao.view;

import br.uefs.ecomp.programacao.controller.ControllerPessoa;
import br.uefs.ecomp.programacao.controller.ControllerVeiculo;
import br.uefs.ecomp.programacao.model.Endereco;
import br.uefs.ecomp.programacao.model.Funcionario;
import java.io.IOException;
import java.util.Iterator;

public class View {
    public static int menu() throws IOException{
        System.out.println("        MENU         ");
        System.out.println("1. Opções Funcionario");
        System.out.println("2. Listar Funcionario");
        System.out.println("3.                   ");
        System.out.println("4.                   ");
        
        int opc = Console.readInt();
        return opc;
    }
    public static void main(String[] args) throws IOException {
        ControllerPessoa controlePessoa = new ControllerPessoa();
        ControllerVeiculo controleVeiculo = new ControllerVeiculo();
        
        int opcao;
        do {
            
            opcao = menu();
            switch (opcao) {
                case 1:
                    System.out.println("Escolha uma opção");
                    System.out.println("1. Cadastrar Funcionario");
                    System.out.println("2. Alterar Funcionario  ");
                    System.out.println("3. Remover Funcionario  ");
                    int opcFuncionario = Console.readInt();
                    
                    switch (opcFuncionario) {
                        case 1:
                            cadastrarFuncionario(controlePessoa);
                            break;
                        case 2:
                            alterarFuncionario(controlePessoa);
                            break;
                        case 3:
                            removerFuncionario(controlePessoa);
                            break;
                        default:
                            throw new AssertionError();
                    }
                break;
                    
                case 2:
                    listarFuncionarios(controlePessoa);
                break;
                default:
                    throw new AssertionError();
            }
        } while (true);
        
    }
    
    public static Endereco cadastrarEndereco() throws IOException{
        System.out.println("Informe os dados sobre o endereço: ");
        
        System.out.print("Logradouro: ");
        String logradouro = Console.readString();
        System.out.print("Numero: ");
        String numero = Console.readString();
        System.out.print("Bairro: ");
        String bairro = Console.readString();
        System.out.print("Cidade: ");
        String cidade = Console.readString();
        System.out.print("Estado: ");
        String estado = Console.readString();
        
        Endereco e = new Endereco(logradouro, numero, bairro, cidade, estado);
        return e;
    }
    public static void cadastrarFuncionario(ControllerPessoa cP) throws IOException{
        System.out.println("Informe os dados abaixo: ");
        
        System.out.print("Nome: ");
        String nome = Console.readString();
        System.out.print("Função: ");
        String funcao = Console.readString();
        System.out.print("Salario: ");
        float salario = Console.readFloat();
        System.out.print("CPF: ");
        String cpf = Console.readString();
        //Endereco endereco = cadastrarEndereco();
        
        cP.cadastrarFuncionario(funcao, salario, nome, cpf, null, null);
    }
    
    public static void alterarFuncionario(ControllerPessoa cP){
    
    }
    
    public static void removerFuncionario(ControllerPessoa cP){
    
    }
    public static void listarFuncionarios(ControllerPessoa cP){
        Iterator itr = cP.iteradorFuncionario();
        System.out.println("Funcionarios cadastrados: \n");
        while (itr.hasNext()) {
            Funcionario f = (Funcionario) itr.next();
            System.out.println(f.getNome());
        }
    }
}