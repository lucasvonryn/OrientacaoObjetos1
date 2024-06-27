package aula13.ex01;

public class Professor extends Pessoa {
    
    private double salarioBase;
    private double salarioTitularizacao;

    public Professor(String nome, int idade, double salarioBase, double salarioTitularizacao) {
        super(nome, idade);
        this.salarioBase = salarioBase;
        this.salarioTitularizacao = salarioTitularizacao;
    }

    public double calcularSalario() {

        return this.salarioBase + this.salarioTitularizacao;
    }

    public void imprimirDados() {

        super.imprimirDados();

        System.out.println("Salário base: " + salarioBase);
        System.out.println("Salário titularização: " + salarioTitularizacao);
        System.out.println("Salário total: " + this.calcularSalario());
    }
}
