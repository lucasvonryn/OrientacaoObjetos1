package lista05.ex03;

public class Aluno {
 
    private String ra;
    private String nome;
    private double[] notas;

    public Aluno(String ra, String nome, double[] notas) {

        this.ra = ra;
        this.nome = nome;
        this.notas = notas;
    }

    public String getRa() {

        return this.ra;
    }

    public String getNome() {

        return this.nome;
    }
    
    public double[] getNotas() {

        return notas;
    }

    public double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
