//ISSO É UMA INTERFACE -> NÃO PODE TER NADA CONCRETO, IMPLEMENTAÇÃO DE CÓDIGO OU ATIBUTOS ETC.

//Contrato autenticavel
	//quem assina esse contrato precisa implementar
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel{

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
