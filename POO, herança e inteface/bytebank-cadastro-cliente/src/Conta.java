
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean tranfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			saca(valor);
			destino.deposito(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}