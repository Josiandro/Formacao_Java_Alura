
public class TestaMetodo {
	public static void main(String[] args) {
		
		// Aqui está instanciando o objeto do tipo Conta
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		// Aqui está invocando o método para fazer deposito na conta
		
		System.out.println(contaDoPaulo.saldo);
	}
}
