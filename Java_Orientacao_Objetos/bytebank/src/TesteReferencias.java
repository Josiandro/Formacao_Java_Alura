//-----------------------------------------------------------------------------------------
// Aqui estão sendo feitos testes de referências dos objetos. Cada vez que instancia-se um
// objeto, a variável do tipo Conta, recebe a referência do objeto e não o objeto em si
//-----------------------------------------------------------------------------------------

public class TesteReferencias {
	public static void main(String[] args) {
		
		// Aqui está instânciando o objeto primeiraConta e guardando a referência para ele
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		//---------------------------------------------------------------------------------
		
		// Aqui a variável segundaConta que é do tipo Conta, está recebendo o valor de primeiraConta, que é a referência para o objeto primeiraConta		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		//---------------------------------------------------------------------------------
		
		// Aqui está sendo atribuido valor ao atributo saldo da segunda conta, porém a primeira também recebe, visto que a segunda usa a mesma referência
		segundaConta.saldo += 100;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		//---------------------------------------------------------------------------------
		
		// Aqui é feito o teste das duas referências		
		if (primeiraConta == segundaConta) {
			System.out.println("são a mesmissima conta");
		}
		
		//---------------------------------------------------------------------------------
		
		// Aqui mostra as referências das duas contas
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
