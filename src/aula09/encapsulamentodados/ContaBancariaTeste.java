package aula09.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		ContaBancaria cb1 = new ContaBancaria(123, "Lucas Von Ryn");
		
		cb1.imprimirSaldo();
		cb1.depositar(500);
		cb1.imprimirSaldo();
		cb1.sacar(500.1);
		cb1.sacar(150);
		cb1.imprimirSaldo();
		
		cb1.setTitular("Otáviano Costa");
		
		System.out.println(cb1.getTitular());
	}
}
