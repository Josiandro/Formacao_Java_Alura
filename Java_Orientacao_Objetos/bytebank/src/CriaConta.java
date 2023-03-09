//-----------------------------------------------------------------------------------------
// Aqui está sendo instânciada a classe Conta(), ou seja, estão sendo criadas as contas
// que também podem ser chamadas de objetos
//-----------------------------------------------------------------------------------------

public class CriaConta {
	public static void main(String[] args) {
		
		// Aqui está sendo instânciado o objeto primeiraConta da classe Conta
		Conta primeiraConta = new Conta();	
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		//---------------------------------------------------------------------------------
		
		// Aqui está sendo instânciado o objeto segundaConta da classe Conta
		Conta segundaConta = new Conta ();
		
		segundaConta.saldo = 50;
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		//---------------------------------------------------------------------------------
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta esta "
				+ "na agencia " + segundaConta.agencia);
		
		//---------------------------------------------------------------------------------
		
		// Aqui sendo feito o teste das duas referências		
		if (primeiraConta == segundaConta) {
			System.out.println("são a mesma conta");
		} else {
			System.out.println("são contas diferentes");
		}
		
	}
}