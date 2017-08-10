package br.uefs.ecomp.programacao.view;

import br.uefs.ecomp.programacao.controller.Controller;
import br.uefs.ecomp.programacao.controller.ControllerPessoa;
import br.uefs.ecomp.programacao.controller.ControllerVeiculo;
import br.uefs.ecomp.programacao.model.Empresa;
import br.uefs.ecomp.programacao.model.Endereco;
import br.uefs.ecomp.programacao.model.Equipamentos;
import br.uefs.ecomp.programacao.model.Funcionario;
import br.uefs.ecomp.programacao.model.Motorista;
import br.uefs.ecomp.programacao.model.NotaFiscal;
import br.uefs.ecomp.programacao.model.SaidaVeiculo;
import br.uefs.ecomp.programacao.model.Veiculo;
import java.io.IOException;
import java.time.LocalDate;

public class View {
    public static int menu() throws IOException{
        System.out.println("        MENU          ");
        System.out.println("1. Opções Funcionario ");
        System.out.println("2. Opções Motorista   ");
        System.out.println("3. Opções Veiculo     ");
        System.out.println("4. Opções Equipamentos");
        System.out.println("5. Opções Empresa     ");
        System.out.println("6. Saida de Veiculos  ");
        System.out.println("7. Abastecimento      ");
        System.out.println("8. Fechar Programa    ");
        
        int opc = Console.readInt();
        return opc;
    }
    public static void main(String[] args) throws IOException {
        ControllerPessoa controlePessoa = new ControllerPessoa();
        ControllerVeiculo controleVeiculo = new ControllerVeiculo();
        Controller c = new Controller();
        
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
                    System.out.println("Escolha uma opção");
                    System.out.println("1. Cadastrar Motorista");
                    System.out.println("2. Alterar Motorista  ");
                    System.out.println("3. Remover Motorista  ");
                    int opcMotorista = Console.readInt();
                    
                    switch (opcMotorista) {
                        case 1:
                            cadastrarMotorista(controlePessoa);
                            break;
                        case 2:
                            alterarMotorista(controlePessoa);
                            break;
                        case 3:
                            removerMotorista(controlePessoa);
                            break;
                        default:
                            throw new AssertionError();
                    }
                break;
                
                case 3:
                    System.out.println("Escolha uma opção");
                    System.out.println("1. Cadastrar Veiculo");
                    System.out.println("2. Alterar Veiculo  ");
                    System.out.println("3. Remover Veiculo  ");
                    int opcVeiculo = Console.readInt();
                    
                    switch (opcVeiculo) {
                        case 1:
                            cadastrarVeiculo(controleVeiculo);
                            break;
                        case 2:
                            alterarVeiculo(controleVeiculo);
                            break;
                        case 3:
                            removerVeiculo(controleVeiculo);
                            break;
                        default:
                            throw new AssertionError();
                    }
                break;
                
                case 4:
                    System.out.println("Escolha uma opção");
                    System.out.println("1. Cadastrar Equipamentos");
                    System.out.println("2. Alterar Equipamentos  ");
                    System.out.println("3. Remover Equipamentos  ");
                    int opcEquipamentos = Console.readInt();
                    
                    switch (opcEquipamentos) {
                        case 1:
                            cadastroEquipamentos(controleVeiculo);
                            break;
                        case 2:
                            alterarEquipamentos(controleVeiculo);
                            break;
                        case 3:
                            removerEquipamentos(controleVeiculo);
                            break;
                        default:
                            throw new AssertionError();
                    }
                break;
                
                case 5:
                    System.out.println("Escolha uma opção");
                    System.out.println("1. Cadastrar Empresa");
                    System.out.println("2. Alterar Empresa  ");
                    System.out.println("3. Remover Empresa  ");
                    int opcEmpresa = Console.readInt();
                    
                    switch (opcEmpresa) {
                        case 1:
                            cadastrarEmpresa(c);
                            break;
                        case 2:
                            alterarEmpresa(c);
                            break;
                        case 3:
                            removerEmpresa(c);
                            break;
                        default:
                            throw new AssertionError();
                    }
                break;
                
                case 6:
                    System.out.println("Escolha uma opção");
                    System.out.println("1. Cadastrar Saida de Veiculo");
                    System.out.println("2. Alterar Saida de Veiculo  ");
                    System.out.println("3. Remover Saida de Veiculo  ");
                    int opcSaidaVeiculo = Console.readInt();
                    
                    switch (opcSaidaVeiculo) {
                        case 1:
                            saidaVeiculo(c, controleVeiculo, controlePessoa);
                            break;
                        case 2:
                            alterarSaidaVeiculo(c, controlePessoa, controleVeiculo);
                            break;
                        case 3:
                            removerSaidaVeiculo(c);
                            break;
                        default:
                            throw new AssertionError();
                    }
                break;
                
                case 7:
                    System.out.println("Escolha uma opção");
                    System.out.println("1. Cadastrar Abastecimento");
                    System.out.println("2. Alterar Abastecimento  ");
                    System.out.println("3. Remover Abastecimento  ");
                    int opcAbastecimento = Console.readInt();
                    
                    switch (opcAbastecimento) {
                        case 1:
                            cadastrarNotaFiscal(c, controleVeiculo);
                            break;
                        case 2:
                            alterarNotaFiscal(c, controleVeiculo);
                            break;
                        case 3:
                            removerNotaFiscal(c);
                            break;
                        default:
                            throw new AssertionError();
                    }
                break;
                
                case 8:
                    System.out.println("Encerrando programa ...");
                    System.exit(0);
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
    
    public static LocalDate cadastrarData() throws IOException{
        int dia, mes, ano;
        LocalDate data;
        
        System.out.print("Informe o dia: ");
        dia = Console.readInt();
        System.out.print("Informe o mês: ");
        mes = Console.readInt();
        System.out.print("Informe o ano: ");
        ano = Console.readInt();
        
        return data = LocalDate.of(ano, mes, dia);
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
        System.out.print("Sexo: ");
        String sexo = Console.readString();
        Endereco endereco = cadastrarEndereco();
        System.out.println("Data de Nascimento:");
        LocalDate dataNascimento = cadastrarData();
        
        cP.cadastrarFuncionario(funcao, salario, nome, cpf, sexo, dataNascimento, endereco);
    }
    
    public static void alterarFuncionario(ControllerPessoa cP) throws IOException{
        System.out.print("Informe o CPF: ");
        String cpf = Console.readString();
        
        Funcionario f = cP.obterFuncionario(cpf);
        if (f == null) {
            System.out.println("Funcionario não encontrado.");
            return;
        }
        System.out.println(f);
        
        System.out.println("Escolha o que deseja atualizar:");
        System.out.println("1. Nome");
        System.out.println("2. CPF");
        System.out.println("3. Sexo");
        System.out.println("4. Data de Nascimento");
        System.out.println("5. Endereço");
        System.out.println("6. Função");
        System.out.println("7. Salario");
        System.out.println("8. Não alterar");
        int opc = Console.readInt();
        
        switch (opc) {
            case 1:
                System.out.print("Informe o nome: ");
                String nome = Console.readString();
                f.setNome(nome);
                break;
            case 2:
                System.out.print("Informe o CPF: ");
                String newcpf = Console.readString();
                f.setCPF(newcpf);
                break;
            case 3:
                System.out.print("Sexo: ");
                String sexo = Console.readString();
                f.setSexo(sexo);
                break;
            case 4:
                System.out.print("Data de nascimento: ");
                LocalDate data = cadastrarData();
                f.setDataNascimento(data);
                break;
            case 5:
                Endereco e = cadastrarEndereco();
                f.setEndereco(e);
                break;
            case 6:
                System.out.print("Função: ");
                String funcao = Console.readString();
                f.setFuncao(funcao);
                break;
            case 7:
                System.out.print("Salario: ");
                float salario = Console.readFloat();
                f.setSalario(salario);
                break;
            case 8:
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    public static void removerFuncionario(ControllerPessoa cP) throws IOException{
        System.out.print("Informe o CPF: ");
        String cpf = Console.readString();
        
        boolean removido = cP.removerFuncionario(cpf);
        if (removido == true) {
            System.out.println("Funcionario removido com sucesso.");
        }else{
            System.out.println("Usuário não foi encontrado no sistema.");
        }
    }
    
    public static void cadastrarMotorista(ControllerPessoa cP) throws IOException{
        System.out.print("Informe os dados abaixo: ");
        
        System.out.print("Nome: ");
        String nome = Console.readString();
        System.out.print("Sexo: ");
        String sexo = Console.readString();
        System.out.print("CPF: ");
        String cpf = Console.readString();
        System.out.print("CNH: ");
        String CNH = Console.readString();
        System.out.println("Data: ");
        LocalDate data = cadastrarData();
        Endereco endereco = cadastrarEndereco();
        
        cP.cadastrarMotorista(CNH, nome, cpf, sexo, data, endereco);
    }
    
    public static void alterarMotorista(ControllerPessoa cP) throws IOException{
        System.out.print("Informe o CPF: ");
        String cpf = Console.readString();
        Motorista m = cP.obterMotorista(cpf);
        if (m == null) {
            System.out.println("Motorista não cadastrado.");
            return;
        }
        System.out.println(m);
        
        System.out.println("Escolha o que deseja atualizar:");
        System.out.println("1. Nome");
        System.out.println("2. CPF");
        System.out.println("3. Sexo");
        System.out.println("4. Data de Nascimento");
        System.out.println("5. Endereço");
        System.out.println("6. CNH");
        System.out.println("7. Não alterar");
        int opc = Console.readInt();
        
        switch (opc) {
            case 1:
                System.out.print("Informe o nome: ");
                String nome = Console.readString();
                m.setNome(nome);
                break;
            case 2:
                System.out.print("Informe o CPF: ");
                String newcpf = Console.readString();
                m.setCPF(newcpf);
                break;
            case 3:
                System.out.print("Sexo: ");
                String sexo = Console.readString();
                m.setSexo(sexo);
                break;
            case 4:
                System.out.print("Data de nascimento: ");
                LocalDate data = cadastrarData();
                m.setDataNascimento(data);
                break;
            case 5:
                Endereco e = cadastrarEndereco();
                m.setEndereco(e);
                break;
            case 6:
                System.out.print("CNH: ");
                String cnh = Console.readString();
                m.setCNH(cnh);
                break;
            case 7:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void removerMotorista(ControllerPessoa cP) throws IOException{
        System.out.print("Informe o CPF: ");
        String cpf = Console.readString();
        
        Motorista m = cP.obterMotorista(cpf);
        boolean removido = cP.removerMotorista(cpf);
        if (removido == true) {
            System.out.println("Motorista removido com sucesso.");
        }else{
            System.out.println("Motorista não cadastrado.");
        }
    }
    
    public static void cadastrarVeiculo(ControllerVeiculo cV) throws IOException{
        System.out.println("Informe os dados abaixo: ");
        
        System.out.print("Placa: ");
        String placa = Console.readString();
        System.out.print("Marca: ");
        String marca = Console.readString();
        System.out.print("Modelo: ");
        String modelo = Console.readString();
        System.out.print("Tipo: ");
        String tipo = Console.readString();
        System.out.print("Hodometro: ");
        float hodometro = Console.readFloat();
        System.out.println("Pneus: ");
        String pneus = Console.readString();
        
        cV.cadastrarVeiculo(placa, marca, modelo, tipo, hodometro, pneus);
    }
    
    public static void alterarVeiculo(ControllerVeiculo cV) throws IOException{
        System.out.print("Informe a placa: ");
        String placa = Console.readString();
        Veiculo v = cV.obterVeiculo(placa);
        if (v == null) {
            System.out.println("Veiculo não cadastrado no sistema.");
            return;
        }
        System.out.println(v);
        
        System.out.println("Escolha o que deseja atualizar:");
        System.out.println("1. Placa");
        System.out.println("2. Marca");
        System.out.println("3. Modelo");
        System.out.println("4. Tipo");
        System.out.println("5. Hodometro");
        System.out.println("6. Pneus");
        System.out.println("7. Não alterar");
        int opc = Console.readInt();
        
        switch (opc) {
            case 1:
                System.out.print("Placa: ");
                String p = Console.readString();
                v.setPlaca(p);
                break;
            case 2:
                System.out.print("Marca: ");
                String marca = Console.readString();
                v.setMarca(marca);
                break;
            case 3:
                System.out.print("Modelo: ");
                String modelo = Console.readString();
                v.setModelo(modelo);
                break;
            case 4:
                System.out.print("Tipo: ");
                String tipo = Console.readString();
                v.setTipo(tipo);
                break;
            case 5:
                System.out.print("Hodometro: ");
                float h = Console.readFloat();
                v.setHodometro(h);
                break;
            case 6:
                System.out.print("Pneus: ");
                String pneus = Console.readString();
                v.setPneus(pneus);
                break;
            case 7:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void removerVeiculo(ControllerVeiculo cV) throws IOException{
        System.out.print("Informe a placa: ");
        String placa  = Console.readString();
        
        boolean removido = cV.removerVeiculo(placa);
        if (removido == true) {
            System.out.println("Veiculo removido com sucesso.");
        }else{
            System.out.println("Veiculo não cadastrado no sistema.");
        }
    }
    
    public static void cadastroEquipamentos(ControllerVeiculo cV) throws IOException{
        System.out.println("Informe os dados abaixo: ");
        
        System.out.print("Nome do equipamento: ");
        String nome = Console.readString();
        System.out.print("Tipo: ");
        String tipo = Console.readString();
        System.out.print("ID: ");
        int id = Console.readInt();
        
        cV.cadastrarEquipamento(nome, tipo, id);
    }
    
    public static void alterarEquipamentos(ControllerVeiculo cV) throws IOException{
        System.out.print("Informe o ID: ");
        int id = Console.readInt();
        
        Equipamentos e = cV.obterEquipamentos(id);
        if (e == null) {
            System.out.println("Equipamento não encontrado.");
            return;
        }
        System.out.println(e);
        System.out.println("Escolha o que deseja atualizar:");
        System.out.println("1. Nome");
        System.out.println("2. Tipo");
        System.out.println("3. ID");
        System.out.println("4. Não alterar");
        int opc = Console.readInt();
        
        switch (opc) {
            case 1:
                System.out.print("Informe o nome: ");
                String nome = Console.readString();
                e.setNome(nome);
                break;
            case 2:
                System.out.print("Tipo: ");
                String tipo = Console.readString();
                e.setTipo(tipo);
                break;
            case 3:
                System.out.print("ID: ");
                int ID = Console.readInt();
                e.setId(ID);
                break;
            case 4:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void removerEquipamentos(ControllerVeiculo cV) throws IOException{
        System.out.println("Informe o ID: ");
        int id = Console.readInt();
        
        boolean removido = cV.removerEquipamentos(id);
        if (removido == true) {
            System.out.println("Removido com sucesso.");
        }else{
            System.out.println("Equipamento não encontrado no sistema.");
        }
    }
    
    public static void cadastrarEmpresa(Controller c) throws IOException{
        System.out.println("Informe os dados da empresa: ");
        
        System.out.print("Razão Social: ");
        String razaoSocial = Console.readString();
        System.out.print("CNPJ: ");
        String CNPJ = Console.readString();
        Endereco endereco = cadastrarEndereco();
        
        c.cadastrarEmpresa(razaoSocial, CNPJ, endereco);
    }
    
    public static void alterarEmpresa(Controller c) throws IOException{
        System.out.print("Informe o CNPJ: ");
        String cnpj = Console.readString();
        Empresa e = c.obterEmpresa(cnpj);
        if (e == null) {
            System.out.println("Empresa não cadastrada.");
            return;
        }
        System.out.println(e);
        
        System.out.println("Escolha o que deseja atualizar:");
        System.out.println("1. Razão Social");
        System.out.println("2. CNPJ");
        System.out.println("3. Endereço");
        System.out.println("4. Não alterar");
        int opc = Console.readInt();
        
        switch (opc) {
            case 1:
                System.out.print("Razão Social: ");
                String rs = Console.readString();
                e.setRazaoSocial(rs);
                break;
            case 2:
                System.out.print("CNPJ: ");
                String CNPJ = Console.readString();
                e.setCnpj(CNPJ);
                break;
            case 3:
                Endereco en = cadastrarEndereco();
                e.setEndereco(en);
                break;
            case 4:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void removerEmpresa(Controller c) throws IOException{
        System.out.print("Informe o CNPJ: ");
        String CNPJ = Console.readString();
        
        boolean removido = c.removeEmpresa(CNPJ);
        if (removido == true) {
            System.out.println("Empresa removida com sucesso!");
        }else{
            System.out.println("Empresa não foi encontrada no sistema.");
        }
    }
    
    public static void saidaVeiculo(Controller c, ControllerVeiculo cV, ControllerPessoa cP) throws IOException{
        System.out.println("Informe os dados abaixo: ");
        
        System.out.print("Placa do Veículo: ");
        String placa = Console.readString();
        Veiculo v = cV.obterVeiculo(placa);
        if (v == null) {
            System.out.println("Veiculo não cadastrado.");
            return;
        }
        System.out.print("CPF do Motorista: ");
        String cpf = Console.readString();
        Motorista m = cP.obterMotorista(cpf);
        if (m == null) {
            System.out.println("Motorista não cadastrado.");
            return;
        }
        System.out.print("CNPJ da empresa: ");
        String CNPJ = Console.readString();
        Empresa e = c.obterEmpresa(CNPJ);
        if (e == null) {
            System.out.println("Empresa não cadastrada.");
            return;
        }
        
        c.cadastrarSaidaDeVeiculo(v, m, e);
    }
    
    public static void alterarSaidaVeiculo(Controller c, ControllerPessoa p, ControllerVeiculo v) throws IOException{
        System.out.print("Informe a placa do veiculo: ");
        String placa = Console.readString();
        
        SaidaVeiculo sv = c.obterSaidaVeiculo(placa);
        if (sv == null) {
            System.out.println("Saida de Veiculo não encontrada no sistema!");
            return;
        }
        System.out.println(sv);
        
        System.out.println("Escolha o que deseja atualizar:");
        System.out.println("1. Veiculo");
        System.out.println("2. Empresa");
        System.out.println("3. Motorista");
        System.out.println("4. Não alterar");
        int opc = Console.readInt();
        
        switch (opc) {
            case 1:
                System.out.print("Insira a placa do veiculo: ");
                String pl = Console.readString();
                Veiculo V = v.obterVeiculo(pl);
                if (V == null) {
                    System.out.println("Veiculo não encontrado.");
                    return;
                }
                sv.setVeiculo(V);
                break;
            case 2:
                System.out.print("Informe o CNPJ da empresa: ");
                String cnpj = Console.readString();
                Empresa e = c.obterEmpresa(cnpj);
                if (e == null) {
                    System.out.println("Empresa não encontrada.");
                    return;
                }
                sv.setEmpresa(e);
                break;
            case 3:
                System.out.print("Informe o CPF do Motorista: ");
                String cpf = Console.readString();
                Motorista m = p.obterMotorista(cpf);
                if (m == null) {
                    System.out.println("Motorista não encontrado.");
                    return;
                }
                sv.setMotorista(m);
                break;
            case 4:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void removerSaidaVeiculo(Controller c) throws IOException{
        System.out.print("Informe a placa do veículo: ");
        String placa = Console.readString();
        
        boolean removido = c.removeSaidaVeiculo(placa);
        if (removido == true) {
            System.out.println("Saida de veiculo removida com sucesso.");
        }else{
            System.out.println("Saida de Veiculo não encontrada no sistema.");
        }
    }
    
    public static void cadastrarNotaFiscal(Controller c, ControllerVeiculo cV) throws IOException{
        System.out.println("Informe os dados abaixo: ");
        
        System.out.print("Placa do veiculo: ");
        String placa = Console.readString();
        Veiculo veiculoDestino = cV.obterVeiculo(placa);
        if (veiculoDestino == null) {
            System.out.println("Veiculo não cadastrado no sistema!");
            return;
        }
        System.out.println("Data: ");
        LocalDate data = cadastrarData();
        System.out.print("Quantidade de litros: "); //Fazer tratamento.
        float quantLitros = Console.readFloat();
        
        c.cadastrarNota(data, quantLitros, veiculoDestino);
    }
    
    public static void alterarNotaFiscal(Controller c, ControllerVeiculo v) throws IOException{
        System.out.print("Informe o numero da nota: ");
        int numNota = Console.readInt();
        
        NotaFiscal nf = c.obterNotaFiscal(numNota);
        if (nf == null) {
            System.out.println("Nota Fiscal não encontrada.");
            return;
        }
        System.out.println(nf);
        
        System.out.println("Escolha o que deseja atualizar:");
        System.out.println("1. Numero da Nota");
        System.out.println("2. Data");
        System.out.println("3. Quantidade de Litros");
        System.out.println("4. Veiculo de destino");
        System.out.println("5. Não alterar");
        int opc = Console.readInt();
        
        switch (opc) {
            case 1:
                System.out.print("Numero: ");
                int num = Console.readInt();
                nf.setNumNota(numNota);
                break;
            case 2:
                System.out.print("Data: ");
                LocalDate data = cadastrarData();
                nf.setData(data);
                break;
            case 3:
                System.out.print("Quantidade: ");
                float qtd = Console.readFloat();
                nf.setQuantLitros(qtd);
                break;
            case 4:
                System.out.print("Informe a placa do veiculo: ");
                String placa = Console.readString();
                Veiculo V = v.obterVeiculo(placa);
                if (V == null) {
                    System.out.println("Veiculo não encontrado.");
                    return;
                }
                nf.setVeiculoDestino(V);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void removerNotaFiscal(Controller c) throws IOException{
        System.out.print("Informe o numero da nota: ");
        int numNota = Console.readInt();
        
        c.removerNotaFiscal(numNota);
    }
}