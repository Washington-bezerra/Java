
public class testaContaMarcela {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		//sempre lembrar de iniciar o objeto, no caso nem cliente,
		//pois se tentar executar a linha 13, sem iniciar, vai dar erro.
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
