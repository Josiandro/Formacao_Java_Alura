// Classe Conta
public class Conta {
	// Atributos da classe Conta
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	//----------------------------------------
	
	// Método para fazer depósitos na conta
	public void deposita(double valor) { 
		this.saldo += valor;
	}		
	
	//----------------------------------------
	
	// Método para fazer saques na conta
	public boolean saca(double valor) {		
		if (this.saldo >= valor) {			
			this.saldo -= valor;
			return true;			
		} else {			
			return false;			
		}
	}
	
	//----------------------------------------
	
	
	
}

