
public class TestaConversao {
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println("Int recebendo double forçado com casting (int): " + valor);
		
		//-----------------------------------------------------------------------------
		
		//Exemplos de outros tipos:	
		float pontoFluante = (float)3.14;
		float pontoFluante2 = 3.14f;
		long numeroGrande = 32334221342L;
		short valorPequeno = 2131;
		byte b = 127;
		
		//double não é tão bom para trabalhar com dinheiro:
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("Soma dos double 0.2 + 0.1 = " + total);
	}
}
