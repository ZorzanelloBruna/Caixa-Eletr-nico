import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCaixaEletronico {


	@Test
	public void testeMovimentacaodeDeConta() {
		CaixaEletronico u = new CaixaEletronico();
		u.ContaBanco();
		u.logar();		
		assertEquals("Retire seu dinheiro", u.sacar(100));
		assertEquals("Depósito realizado com sucesso", u.depositar(200));
		assertEquals("Seu saldo é de R$700.0", u.saldo());
	}
	
	@Test
	public void testeHardware() {
		MockHardware mock = new MockHardware();
		mock.setNumeroConta(100200);
		assertEquals(100200, mock.pegarNumeroContaCartao());		
	}
	@Test
	public void recuperarConta() {
		MockConferirServicoRemoto mock2 = new MockConferirServicoRemoto();
		mock2.setNumeroConta(100200);
		assertEquals(100200, mock2.recuperarConta());		
	}	
	
	@Test
	public void testeServicoRemoto() {
		MockConferirServicoRemoto mock2 = new MockConferirServicoRemoto();
		mock2.setSaldo(300);
		mock2.sacar(50);
		mock2.falhaAoExetutar();
		assertEquals(250, mock2.persistirConta());
	}
	

}
