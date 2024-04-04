package aula7;

public class Pessoa {
    
    // Declarar atributos da classe
    String nome;
    int idade;
    double peso;
    
    // Método construtor
    public Pessoa(String nome, int idade, Double peso) {
    	
    	this.nome = nome;
    	this.idade = idade;
    	this.peso = peso;
    }

    // Declarar os métodos da classe
    public void andar() {

        System.out.println(this.nome + " está andando.");
    }

    public void correr() {
        
        System.out.println(this.nome + " está correndo.");
    }
    
    public void falar() {
        
        System.out.println(this.nome + " está falando.");
    }

    public void imprimirDados() {

        System.out.println("==================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
    }

    public String toString() {

        return this.nome + " " + this.idade + " " + this.peso;
    }
}
