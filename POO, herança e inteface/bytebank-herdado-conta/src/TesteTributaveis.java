
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(0001, 200000);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registraTribunavel(cc);
		calc.registraTribunavel(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
