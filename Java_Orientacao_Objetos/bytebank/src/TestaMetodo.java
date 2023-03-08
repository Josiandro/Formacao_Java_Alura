public class TestaMetodo {
	public static void main(String[] args) {
		
		// Aqui está instânciando o objeto contaDoPaulo		
		Conta contaDoPaulo = new Conta();		
		contaDoPaulo.saldo = 100;
		
		//----------------------------------------
		
		// Aqui está invocando o método deposita() para depositar um valor na contaDoPaulo
		contaDoPaulo.deposita(50);		
		System.out.println(contaDoPaulo.saldo);
		
		//----------------------------------------
		
		// Aqui está invocando o método saca() para retirar um valor da contaDoPaulo		
		contaDoPaulo.saca(30);
		System.out.println(contaDoPaulo.saldo);
		
		//----------------------------------------
		
		// Aqui está invocando o mesmo método saca(), porém está usando o retorno boolean
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Conseguiu retirar: " + conseguiuRetirar);
	}
}
