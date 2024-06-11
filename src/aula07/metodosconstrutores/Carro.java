package aula07;

public class Carro {
    
    // Declarar atributos da classe
    String modelo;
    String marca;
    int ano;
    String placa;
    String cor;
    boolean ligado;
    int velocidade;
    
    // Método construtor
    public Carro(String modelo, String marca, int ano, String placa, String cor) {
    	
    	this.modelo = modelo;
    	this.marca = marca;
    	this.ano = ano;
    	this.placa = placa;
    	this.cor = cor;
    	this.ligado = false;
    	this.velocidade = 0;
    }
    
    public Carro(String placa) {
    	
    	this.modelo = "Não informado";
    	this.marca = "Não informado";
    	this.ano = 0;
    	this.placa = placa;
    	this.cor = "Não informado";
    	this.velocidade = 0;
    	this.ligado = false;
    }

    // Declarar os métodos da classe (funções e procedimentos em C)
    public void ligar() {

        if (this.ligado == false) {
            
            this.ligado = true;

            System.out.println(this.marca + " " + this.modelo + " está ligando.");

        } else {

            System.out.println(this.marca + " " + this.modelo + " já está ligado.");

        }
    
    }

    public void desligar() {

        if (this.ligado == true) {

            ligado = false;

            System.out.println(this.marca + " " + this.modelo + " está desligando.");

        } else {

            System.out.println(this.marca + " " + this.modelo + " já está desligado.");

        }
    }

    public void acelerar() {

        System.out.println(this.marca + " " + this.modelo + " está acelerando.");
    }

    public void frear() {

        System.out.println(this.marca + " " + this.modelo + " está freando.");
    }

    public void imprimirDados () {

        System.out.println("=====================");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade: " + this.velocidade);
    }

    @Override
    public String toString() {

        return this.modelo + " " + this.marca + " " + this.ano + " " + this.placa + " " + this.cor;
    }
}
