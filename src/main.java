
public class main {

	public static void main(String[] args) {
		CaixaEletronico u = new CaixaEletronico();
		u.ContaBanco();
		u.depositar(100);
		u.sacar(500);
		u.estadoAtual();
		System.out.println(u.saldo());
		
		MockHardware mock = new MockHardware();
		mock.setNumeroConta(100200);
		System.out.println(mock.pegarNumeroContaCartao());	
		
		MockConferirServicoRemoto mock2 = new MockConferirServicoRemoto();	
		mock2.setSaldo(400);
		mock2.sacar(100);
		
		System.out.println(mock2.persistirConta());
		mock2.falhaAoExetutar();
		
	}

}
