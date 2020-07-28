//com o abstract, n�o poss�vel criar um funcionario generico
//exemplo: Funcionario f = new Funcionario(); -> isso n�o � mais permitido
//Correto seria Funcionario f = new Gerente();
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//o protected deixa o atributo visivel para classe filho
	private double salario;
	private int tipo = 0; //0 - Funcionario comum, 2 - Gerente, 3 - diretor
	
	//metodo sem corpo
	//a implementa��o dos metodos ser� nos filhos
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String setCpf(String cpf) {
		return this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public double setSalario(double salario) {
		return this.salario = salario;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}		
	public int getTipo() {
		return tipo;
	}


}
