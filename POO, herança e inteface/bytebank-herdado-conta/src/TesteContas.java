
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(0010, 22245452);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(1000, 54522242);
		cp.deposita(200.0);
		
		//será chamdo o metodo dessa class, por conta do this que está apontando
		//para a class ContaCorrente.
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	
	}

}
