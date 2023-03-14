//-----------------------------------------------------------------------------------------
// Aqui estão sendo invocados os métodos criados para a classe Conta() e assim testamos
// o uso de cada método
//-----------------------------------------------------------------------------------------

public class TestaMetodo {
	public static void main(String[] args) {
		
		// Aqui está instânciando o objeto contaDoPaulo		
		Conta contaDoPaulo = new Conta();		
		contaDoPaulo.saldo = 100;
		
		//---------------------------------------------------------------------------------
		
		// Aqui está invocando o método deposita() para depositar um valor na contaDoPaulo
		contaDoPaulo.deposita(50);		
		System.out.println("saldo da contaDoPaulo: " + contaDoPaulo.saldo);
		
		//---------------------------------------------------------------------------------
		
		// Aqui está invocando o método saca() para retirar um valor da contaDoPaulo		
		contaDoPaulo.saca(20);
		System.out.println("saldo da contaDoPaulo: " + contaDoPaulo.saldo);
		
		//---------------------------------------------------------------------------------
		
		// Aqui está invocando o mesmo método saca(), porém está usando o retorno boolean
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Conseguiu retirar: " + conseguiuRetirar);
		
		//---------------------------------------------------------------------------------
		
		// Aqui está instânciando o objeto contaDaMarcela
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("(contaDamarcela) transferência com sucesso");
		} else {
			System.out.println("(contaDamarcela) faltou dinheiro");
		}
		
		System.out.println("saldo da contaDaMarcela: " + contaDaMarcela.saldo);
		System.out.println("saldo da contaDoPaulo: " + contaDoPaulo.saldo);
	}
}
