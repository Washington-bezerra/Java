//ISSO � UMA INTERFACE -> N�O PODE TER NADA CONCRETO, IMPLEMENTA��O DE C�DIGO OU ATIBUTOS ETC.

//Contrato autenticavel
	//quem assina esse contrato precisa implementar
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel{

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
