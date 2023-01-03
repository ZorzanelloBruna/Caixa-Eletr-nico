
public class MockConferirServicoRemoto implements ServicosRemoto {

	private int numeroConta;
	private float saldo;
	private boolean falhaNoExecutar;
		
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	public float sacar(float valor) {
			if (this.getSaldo() >= valor) 
				this.setSaldo(this.getSaldo() - valor);
				return getSaldo();		
	}
	public float depositar(float valor) {
			if (this.getSaldo() >= valor) 
				this.setSaldo(this.getSaldo() - valor);
				return getSaldo();			
		}	

	@Override
	public int recuperarConta() {
		return numeroConta;
	}

	@Override
	public float persistirConta() {
		if(falhaNoExecutar)
			throw new RuntimeException("Falha ao executar teste");
		return saldo;
		
	}

	public void falhaAoExetutar() {
		falhaNoExecutar= true;
	}

	

}
