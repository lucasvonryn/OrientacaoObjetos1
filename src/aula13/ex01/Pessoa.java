package aula13.ex01;

public class Pessoa {
    
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
