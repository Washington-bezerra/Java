
public class TesteBanco {

	public static void main(String[] args) {
		Cliente caio = new Cliente();
		caio.nome = "Caio";
		caio.cpf = "123.456.789-10";
		caio.profissao = "programmador";
		
		Conta contaCaio = new Conta();
		contaCaio.deposito(100);
		
		contaCaio.titular = caio;
		System.out.println(contaCaio);
	}

}
	