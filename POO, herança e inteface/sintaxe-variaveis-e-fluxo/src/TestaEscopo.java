
public class TestaEscopo {

	public static void main(String[] args) {
		
		System.out.println("Testando condicional");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}
		else {
			System.out.println("Você não pode entrar");
		}

	}

}
