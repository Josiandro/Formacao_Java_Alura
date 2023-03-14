// Classe Conta() com seus atributos e métodos
public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	// Aqui foi substituída a String titular pela referência de outra classe que possui atributos específicos
	Cliente titular; 
	
	// Método para fazer depósitos na conta
	public void deposita(double valor) { 
		this.saldo += valor;
	}		
	
	// Método para fazer saques na conta
	public boolean saca(double valor) {		
		if (this.saldo >= valor) {			
			this.saldo -= valor;
			return true;			
		} else {			
			return false;			
		}
	}

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

