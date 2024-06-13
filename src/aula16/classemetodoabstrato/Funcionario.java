package aula16.classemetodoabstrato;

public abstract class Funcionario {
    
    protected String nome;
    protected int cpf;
    protected Double salarioBase;

    public Funcionario(String nome, int cpf, Double salarioBase) {

        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario() {

        return 0.00;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salarioBase=" + salarioBase + "]";
    }
}