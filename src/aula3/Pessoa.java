package aula3;

public class Pessoa {
    
    // Declarar atributos da classe
    String nome;
    int idade;
    double peso;

    // Declarar os métodos da classe (funções e métodos em C)
    public void andar() {

        System.out.println(nome + " está andando.");
    }

    public void correr() {
        
        System.out.println(nome + " está correndo.");
    }
    
    public void falar() {
        
        System.out.println(nome + " está falando.");
    }

    public void imprimirDados() {

        System.out.println("==================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("==================");
    }

    public String toString() {

        return nome + " " + idade + " " + peso;
    }
}
