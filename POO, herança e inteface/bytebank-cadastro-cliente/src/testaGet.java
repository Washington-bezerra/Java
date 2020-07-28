
public class testaGet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposito(100);
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
	}

}
