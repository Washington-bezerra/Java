
public class TesteValoresEConstrutor {

	public static void main(String[] args) {
		Conta conta = new Conta(1548, 165974);
		Conta conta2 = new Conta(1548, 154845);	
		Conta conta3 = new Conta(1548, 654942);
		//System.out.println(conta.getAgencia() + " " + conta.getNumero());
		
		System.out.println(Conta.getTotal());
	}

}
