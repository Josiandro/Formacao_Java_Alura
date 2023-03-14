//-----------------------------------------------------------------------------------------
// Aqui está sendo criada a classe Conta, que na verdade, é a especificação do tipo conta
// Dentro da classe existem atributos e métodos usados para alterar estes atributos
//-----------------------------------------------------------------------------------------

// Classe Conta()
public class Conta {
	
	// Atributos
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	//---------------------------------------------------------------------------------
	
	// Método para fazer depósitos na conta
	public void deposita(double valor) { 
		this.saldo += valor;
	}		
	
	//---------------------------------------------------------------------------------
	
	// Método para fazer saques na conta
	public boolean saca(double valor) {		
		if (this.saldo >= valor) {			
			this.saldo -= valor;
			return true;			
		} else {			
			return false;			
		}
	}
	
	//---------------------------------------------------------------------------------

	// Método para fazer transferências
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
	
		return false;
	} 
	
	// Método para fazer transferências reaproveitando o método saca()
	public boolean transfere2(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} 
		
		return false;
	}
	
	//---------------------------------------------------------------------------------
	
	
}

