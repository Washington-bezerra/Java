package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 200;
		//System.out.println(primeiraconta.saldo);
		
		primeiraconta.saldo += 100;
		
		
		Conta segundaconta = new Conta();
		segundaconta.saldo = 50;
		
		System.out.println("A primera tem " + primeiraconta.saldo);
		System.out.println("A segunda tem " + segundaconta.saldo);
	}

}
