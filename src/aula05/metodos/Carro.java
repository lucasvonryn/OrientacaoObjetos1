package aula05.metodos;

public class Carro {

	// declarar os atributos da classe
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;

	// declarar os m�todos da classe
	public void ligar() {

		System.out.println(marca + " " + modelo + " est� ligando.");
	}

	public void desligar() {

		System.out.println(marca + " " + modelo + " est� desligando.");
	}

	public void acelerar() {

		System.out.println(marca + " " + modelo + " est� acelerando.");
	}

	public void frear() {

		System.out.println(marca + " " + modelo + " est� freando.");
	}

	public void imprimirDados() {

		System.out.println("====================");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Ano: " + ano);
		System.out.println("Placa: " + placa);
		System.out.println("Cor: " + cor);
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
