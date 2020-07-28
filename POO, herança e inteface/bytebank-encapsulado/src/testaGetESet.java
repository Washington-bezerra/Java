
public class testaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(0001, 22245452);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente washington = new Cliente();
		washington.setNome("Washington Luis");
		
		conta.setTitular(washington);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Dev");
		//ou podemos fazer em 2 linha
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("DevOps");
		
		
		System.out.println(washington);
		System.out.println(conta.getTitular());
		System.out.println(titularDaConta);

	}

}
