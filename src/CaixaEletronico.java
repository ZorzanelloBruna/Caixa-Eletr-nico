
public class CaixaEletronico {

	private int numeroConta;
	private String nome;
	private float saldo;
	private boolean status;
	

	public CaixaEletronico() {
		// TODO Auto-generated constructor stub
	}

	public void estadoAtual(){
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
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

	public void setSaldo(float valor) {
		this.saldo = valor;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void ContaBanco() {
		this.setSaldo(1000);
		this.setStatus(true);
	}

	public String logar() {
		if (this.status == true)
			return "Usuário autenticado";

		return "Não foi possível autenticar o usuário";
	}

	public String sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				return "Retire seu dinheiro";
			}
		}
		return "Saldo insuficiente";
	}

	public String depositar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				return "Depósito realizado com sucesso";
			}
		}
		return "Saldo insuficiente para depositar";
	}

	public String saldo() {
		return "Seu saldo é de R$" + this.getSaldo();
	}

}
