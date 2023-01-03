
public class ContaCorrente {

	private String nome;
	private int numeroConta;
	private float saldo;

	public float sacar( float valor) {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		caixaEletronico.sacar(valor);		
		return getSaldo();		
	}
	
	public float depositar( float valor) {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		caixaEletronico.depositar(valor);		
		return getSaldo();		
	}
	
	public float saldo( float valor) {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		caixaEletronico.saldo();		
		return saldo;		
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

}
