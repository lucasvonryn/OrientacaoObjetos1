package aula9;

public class ContaBancaria {

	// Encapsulamento dos atributos para não serem acessados de fora da classe
	// Isso previne que 
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular) {
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Deposito realizado com sucesso");
		System.out.println("Saldo atual: " + this.saldo);

		calcularRendimento();
	}
	
	public void sacar(double valor) {
		
		if (valor <= this.saldo) {
			
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso");
			System.out.println("Saldo atual: " + this.saldo);
			
		} else {
			
			System.out.println("Saldo insuficiente");
			System.out.println("Saldo atual: " + this.saldo);
			
		}
	}
	
	public void imprimirSaldo() {
		
		System.out.println("============================");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Nome do Títular: " + this.titular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("============================");
	}
	
	// Encapsulamento do método para não ser acessado de fora da classe
	private void calcularRendimento() {
		
		this.saldo *= 1.1;
	}
	
	// Método Setter para alterar o nome do títular
	public void setTitular(String titular) {
		
		this.titular = titular;
	}
	
	// Método Getter para obter o nome do títular
	public String getTitular() {
		
		return this.titular;
	}
}