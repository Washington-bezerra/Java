
public class TestaFuncionario {
  
	  public static void main(String[] args) {
	  
	  Gerente washington = new Gerente();
	  washington.setNome("Washington Luís Santos Bezerra");
	  washington.setCpf("359.336.978-85"); washington.setSalario(1000.00);
	  
	  System.out.println(washington.getNome());
	  System.out.println(washington.getCpf());
	  System.out.println(washington.getSalario());
	  System.out.println(washington.getBonificacao());
	  
	  }
} 