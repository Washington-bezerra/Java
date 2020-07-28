
public class ContaCorrente extends Conta implements Tributavel{

		public ContaCorrente(int agencia, int numero) {
			//chama o construtor da clase mãe
			//se ñ tivessemos feito um contrutor, poderiamos deixar somente super()
			super(agencia, numero);
		}
		
		@Override
		public boolean saca(double valor) {
									//taxa
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
		}

		@Override
		public void deposita(double valor) {
			super.saldo += valor;
			
		}

		@Override
		public double getValorImporto() {
			return super.saldo * 0.01;
		}
}
