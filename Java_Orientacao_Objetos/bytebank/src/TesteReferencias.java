
public class TesteReferencias {
	public static void main(String[] args) {
		
		// primeiraConta é um referência para o objeto do tipo Conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		//----------------------------------------
		
		// segundaConta recebe a referência primeiraConta
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		//----------------------------------------
		
		segundaConta.saldo += 100;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		//----------------------------------------
		
		// Aqui é feito o teste das duas referências
		if (primeiraConta == segundaConta) {
			System.out.println("são a mesmissima conta");
		}
		
		//----------------------------------------
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
