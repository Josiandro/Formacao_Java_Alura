public class TestaBanco {
	public static void main(String[] args) {
		
		// Aqui está sendo instânciada a classe Cliente(), criando o objeto paulo e atribuindo valores
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		// Aqui está sendo instânciada a classe Conta(), criando o objeto contaDoPaulo e depositando 100 reais
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		// Aqui associa o cliente paulo com a conta contaDoPaulo
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
		//---------------------------------------------------------------------------------
		
	}
}
