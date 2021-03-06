public class ContaEspecial extends Conta{

	double limiteAdicional;
	double tax = 5.0;

	public ContaEspecial(String numConta, double saldo, double limiteAdicional, String numCartao) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.limiteAdicional = limiteAdicional;
		this.numCartao = numCartao;

	}
	
	@Override
	public void saque(double value) {
		if (value > (saldo + limiteAdicional)) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= value + tax;
		}
	}

	@Override
	public void deposito(double value) {
		saldo += value;
	}

	public double getLimiteAdicional() {
		return limiteAdicional;
	}
	
	@Override
	public String toString() {
		return " numConta: " +
				numConta + "\n saldo: " +
				saldo + "\n numCartao: " 
				+ numCartao ;
	}
	@Override
	public void dadosConta() {
		System.out.println("=======Dados da conta======="+"\n"+
				"Numero Conta: "+this.numCartao+"\n"+
				"Saldo atual: "+this.saldo);
	}
}