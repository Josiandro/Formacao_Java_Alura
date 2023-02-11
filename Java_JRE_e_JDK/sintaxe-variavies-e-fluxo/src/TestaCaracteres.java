
public class TestaCaracteres {
	public static void main(String[] args) {
		
		char letra = 'A';
		System.out.println("Letra: " + letra);
		
		char valor = 66;
		System.out.println("Número da letra: " + valor);
		
		valor = (char) (valor + 1);
		System.out.println("Número da letra + 1 forçando com casting (char): " + valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println("Strings: " + palavra);
		
		palavra = palavra + 2020;
		System.out.println("Concatenar String com número: " + palavra);
	}
}
