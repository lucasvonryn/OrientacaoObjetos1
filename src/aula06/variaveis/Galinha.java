package aula06.variaveis;

public class Galinha {
    
    String nome;
    int quantidadeOvos;
    static int quantidadeTotalOvos;

    public void botar() {

        quantidadeOvos++;
        quantidadeTotalOvos++;
    }

    public String toString() {

        return nome + " " + quantidadeOvos + " " + quantidadeTotalOvos;
    }
}
