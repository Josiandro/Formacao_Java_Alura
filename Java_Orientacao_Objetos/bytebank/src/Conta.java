// Classe Conta que é na verdade a especição do tipo Conta

public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	// Dentro da classe estão os campos, atributos ou propriedades da conta
	
	//----------------------------------------
	
	// Comportamentos/métodos da classe Conta, o método sempre inicia com letra minúscula	
	// O void é usado quando não tem retorno do método, ou seja, é vazio
	
	void deposita(double valor) { 
		this.saldo = this.saldo + valor;
	}

	// O this não é obrigatório no momento, mas ele indica a alteração NESTA conta
	
	//----------------------------------------
}

