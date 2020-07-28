package bytebank;

public class TesteMetodo {
	
	public static void main(String[] args) {
		
		Conta ContaWashington = new Conta();
		ContaWashington.saldo += 100;
		ContaWashington.deposito(50);
		System.out.println(ContaWashington.saldo);
		
		if (ContaWashington.saca(20) == true) {
			System.out.println("Saque realizado com sucesso!! Agora seu saldo é "
					+ ContaWashington.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposito(1000);
		
		if(contaMarcela.tranfere(1300, ContaWashington) == true){
			System.out.println("Transferencia realizada com sucesso!! Agora seu saldo é de " + contaMarcela.saldo);
		}else {
			System.out.println("Saldo insuficiente p/ realizar a transferencia");
		}
		
		
	}
}
