
public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registraTribunavel(Tributavel t) {
		double valor = t.getValorImporto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
