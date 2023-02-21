
public class Fatorial {
	public static void main(String[] args) {
		
		int fatorial = 6;
		int resultado = 1;
		String expressao = fatorial + "! = ";
		
		for(int n = 1; n <= fatorial; n++) {
			resultado *= n;
			
			if (n < fatorial) {
				expressao += n + " x ";
			} else {
				expressao += n + " = " + resultado;
			}
		}
		
		System.out.println(expressao);
	}
}
