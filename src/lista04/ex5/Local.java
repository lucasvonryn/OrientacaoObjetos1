package lista04.ex5;

public class Local {
    
    private String nome;
    private Endereco endereco;
    private int capacidadeMaxima;

    public Local(String nome, Endereco endereco, int capacidadeMaxima) {

        this.nome = nome;
        this.endereco = endereco;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCapacidadeMaxima() {

        return this.capacidadeMaxima;
    }

    @Override
    public String toString() {

        return nome + " (" + capacidadeMaxima + " lugares) - " + endereco;
    }
}
