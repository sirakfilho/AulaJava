package projeto02;

public class Conta {
	
	private String agencia;
	private String numero;
	private double saldo;
	
	public double sacar(double valor) {
		return this.saldo-valor;
		
	}

	public double depositar (double valor, Conta conta) {
		double novoSaldo = conta.Saldo() + valor;
		conta.setSaldo(novosaldo);
		return conta.getSaldo();
	}
	
	public boolean transferir(double valor, Conta origem, Conta destino) {
		String mensagem = "";
		if(origem.getSaldo()>=valor) {
			if(origem.getNumero() != destino.getNumero()) {
				destino.setSaldo(destino.getSaldo() + valor);
				origem.setSaldo(origem.getSaldo() - valor);
				return true;
				
			}else {
				mensagem = "Você está tentando transferir para mesma conta"
						
			}else {
				mensagem = "Saldo insuficiente"
			}
			throw new ExceptionTransferir(mensagem);
			
			}
				
		}
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
}
