
public class MockHardware implements Hardware {
	
	private int numeroConta;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public int pegarNumeroContaCartao() {
		
		return numeroConta;
	}

	@Override
	public void lerEnvelope() {
		// TODO Auto-generated method stub
		
	}
	
	

}
