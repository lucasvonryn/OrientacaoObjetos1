package aula12;

public class Carro {
	
	String modelo;
	String marca;
	int ano;

	public Carro(String modelo, String marca, int ano) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + this.modelo + ", marca=" + this.marca + ", ano=" + this.ano + "]";
	}
}
