package br.uefs.ecomp.programacao.test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

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
import junit.framework.TestCase;

public class ControllerTest extends TestCase{
	
	private Controller cont ;
	private ControllerPessoa contP ;
	private ControllerVeiculo contV;
	
	@Before
	public void setUp() throws Exception {
		cont = new Controller();
		contP = new ControllerPessoa();
		contV = new ControllerVeiculo();
	}

	@Test
	public void testCadastrarEmpresa(){
		
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		Empresa ret = cont.cadastrarEmpresa("Trabalho","111344342",ender);
		
		
		assertEquals("Trabalho",ret.getRazaoSocial());
		assertEquals("Rua A",ret.getEndereco().getRua());
		assertEquals("111344342",ret.getCnpj());
		
	
	}
	
	@Test
	public void testObterEmpresa(){
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		
		cont.cadastrarEmpresa("Trabalho","111344342",ender);
		
		Empresa ret = cont.obterEmpresa("111344342");
		
		assertEquals("Trabalho",ret.getRazaoSocial());
		assertEquals("20",ret.getEndereco().getNumero());
		
	}
	
	@Test
	public void testRemoverEmpresa(){
		
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		cont.cadastrarEmpresa("Trabalho","111344342",ender);
		
		boolean removeu = cont.removeEmpresa("111344342");
		
		assertEquals(true,removeu);
	}
	
	@Test
	public void testCadastrarSaidaDeVeiculo(){
		
		Veiculo vei = new Veiculo("JSW-1823","WOLKS","GOL","1.0",10000.0f,"aaa");
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		Motorista mot = new Motorista("222222222","Carlos","123456789-19","Masculino",null,ender);
		Empresa emp = new Empresa("Trabalho","111344342",ender);
		SaidaVeiculo sV ;
		
		sV = cont.cadastrarSaidaDeVeiculo(vei, mot, emp);
		
		
		assertEquals(emp,sV.getEmpresa());
		assertEquals(mot,sV.getMotorista());
		assertEquals(vei,sV.getVeiculo());
		
	}
	
	@Test
	public void testObterSaidaDeVeiculo(){
		
		Veiculo vei = new Veiculo("JSW-1823","WOLKS","GOL","1.0",10000.0f,"aaa");
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		Motorista mot = new Motorista("222222222","Carlos","123456789-19","Masculino",null,ender);
		Empresa emp = new Empresa("Trabalho","111344342",ender);
		SaidaVeiculo sV ;
		
		cont.cadastrarSaidaDeVeiculo(vei, mot, emp);
		sV = cont.obterSaidaVeiculo("JSW-1823");
		
		assertEquals("111344342",sV.getEmpresa().getCnpj());
		assertEquals("222222222",sV.getMotorista().getCNH());
		assertEquals("JSW-1823",sV.getVeiculo().getPlaca());
		
	}
	
	@Test
	public void testRemoverSaidaDeVeiculo(){
		
		Veiculo vei = new Veiculo("JSW-1823","WOLKS","GOL","1.0",10000.0f,"aaa");
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		Motorista mot = new Motorista("222222222","Carlos","123456789-19","Masculino",null,ender);
		Empresa emp = new Empresa("Trabalho","111344342",ender);
		
		cont.cadastrarSaidaDeVeiculo(vei, mot, emp);
		boolean removeu = cont.removeSaidaVeiculo("JSW-1823");
		
		assertEquals(true,removeu);
		
	}
	
	@Test
	public void testCadastrarNotaFiscal(){
		
		Veiculo vei = new Veiculo("JSW-1823","WOLKS","GOL","1.0",10000.0f,"aaa");
		NotaFiscal nf ;
		nf = cont.cadastrarNota(null,1000.0f,vei);
		
		assertEquals(1,nf.getNumNota());
		assertEquals("GOL",nf.getVeiculoDestino().getModelo());
		
	}
	
	@Test
	public void testObterNotaFiscal(){
		
		Veiculo vei = new Veiculo("JSW-1823","WOLKS","GOL","1.0",10000.0f,"aaa");
		NotaFiscal nf ;
		cont.cadastrarNota(null,1000.0f,vei);
		nf = cont.obterNotaFiscal(1);
		
		assertEquals(1000.0f,nf.getQuantLitros());
		
	}
	
	@Test
	public void testRemoverNotaFiscal(){
		
		Veiculo vei = new Veiculo("JSW-1823","WOLKS","GOL","1.0",10000.0f,"aaa");
		NotaFiscal nf ;
		nf = cont.cadastrarNota(null,1000.0f,vei);
		
		boolean removeu = cont.removerNotaFiscal(1);
		
		assertEquals(true,removeu);
		
	}
	
	@Test
	public void testCadastrarFuncionario(){
		
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		Funcionario fun ;
		
		fun = contP.cadastrarFuncionario("aaaa", 1000.0f, "Ricardo", "07928371623-10", "Masculino",null, ender);
		
		assertEquals("Ricardo",fun.getNome());
		assertEquals("Rua A",fun.getEndereco().getRua());
		assertEquals("aaaa",fun.getFuncao());
	}
	
	@Test
	public void testObterFuncionario(){
		
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		Funcionario fun ;
		
		contP.cadastrarFuncionario("aaaa", 1000.0f, "Ricardo", "07928371623-10", "Masculino",null, ender);
		fun = contP.obterFuncionario("07928371623-10");
		
		assertEquals("aaaa",fun.getFuncao());
		assertEquals("Ricardo",fun.getNome());
		assertEquals("Masculino",fun.getSexo());
		assertEquals(1000.0f,fun.getSalario());
		
	}
	
	@Test
	public void testRemoverFuncionario(){
		
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		
		contP.cadastrarFuncionario("aaaa", 1000.0f, "Ricardo", "07928371623-10", "Masculino",null, ender);
		
		boolean removeu = contP.removerFuncionario("07928371623-10");
		
		assertEquals(true,removeu);
	}
	
	
	@Test
	public void testCadastrarMotorista(){
		
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		Motorista mot;
		
		mot = contP.cadastrarMotorista("222222222","Carlos","123456789-19","Masculino",null,ender);
		
		assertEquals("123456789-19",mot.getCPF());
		assertEquals("222222222",mot.getCNH());
	}
	
	@Test
	public void testObterMotorista(){
		
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		Motorista mot;
		
		contP.cadastrarMotorista("222222222","Carlos","123456789-19","Masculino",null,ender);
		
		mot = contP.obterMotorista("123456789-19");
		
		assertEquals("Rua A",mot.getEndereco().getRua());
		assertEquals("Carlos",mot.getNome());
	}
	
	@Test
	public void testRemoverMotorista(){
		
		Endereco ender = new Endereco("Rua A","20","Rua Nova","Feira","Bahia");
		contP.cadastrarMotorista("222222222","Carlos","123456789-19","Masculino",null,ender);
		
		boolean removeu = contP.removerMotorista("123456789-19");
		
		assertEquals(true,removeu);
		
	}
	
	@Test
	public void testCadastrarVeiculo(){
		
		Veiculo vei;
		vei = contV.cadastrarVeiculo("JSW-1823","WOLKS","GOL","1.0",10000.0f,"aaa");
		
		assertEquals("GOL",vei.getModelo());
		assertEquals("WOLKS",vei.getMarca());
		assertEquals("1.0",vei.getTipo());
	}
	
	@Test
	public void testObterVeiculo(){
		
		Veiculo vei;
		contV.cadastrarVeiculo("JSW-1823","WOLKS","GOL","1.0",10000.0f,"aaa");
		
		vei = contV.obterVeiculo("JSW-1823");
		
		assertEquals("aaa",vei.getPneus());
		assertEquals(10000.0f,vei.getHodometro());
		
	}
	
	@Test
	public void testRemoverVeiculo(){
		
		
		contV.cadastrarVeiculo("JSW-1111","WOLKS","GOL","1.0",10000.0f,"aaa");
		
		boolean removeu = contV.removerVeiculo("JSW-1111");
		
		assertEquals(true,removeu);
		
		
	}
	
	@Test
	public void testCadastrarEquipamentos(){
		
		Equipamentos eqp;
		eqp = contV.cadastrarEquipamento("TripleX", "AirBag", 112);
		
		assertEquals("TripleX",eqp.getNome());
		assertEquals(112,eqp.getId());
		
	}
	
	@Test
	public void testObterEquipamento(){
		
		Equipamentos eqp;
		contV.cadastrarEquipamento("TripleX", "AirBag", 112);
		
		eqp = contV.obterEquipamentos(112);
		
		assertEquals("TripleX",eqp.getNome());
		assertEquals("AirBag",eqp.getTipo());
	}
	
	@Test
	public void testRemoverEquipamento(){
		
		contV.cadastrarEquipamento("TripleX", "AirBag", 112);
		
		boolean removeu = contV.removerEquipamentos(112);
		
		assertEquals(true,removeu);
		
		
	}
}
