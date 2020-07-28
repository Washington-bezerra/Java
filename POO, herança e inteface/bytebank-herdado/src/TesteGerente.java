
public class TesteGerente {

	public static void main(String[] args) {
		
		Funcionario referencia = new Gerente();

		
		Gerente g1 = new Gerente();
		g1.setNome("Joao");
		g1.setCpf("359.000.978-88");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		  g1.setSenha(222); System.out.println(g1.autentica(222));
		 
		
		 System.out.println(g1.getBonificacao()); 
		
	}

}