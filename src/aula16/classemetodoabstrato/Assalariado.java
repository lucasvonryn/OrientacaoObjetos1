package aula16.classemetodoabstrato;

public class Assalariado extends Funcionario {

    private Double adicional;

    public Assalariado(String nome, int cpf, Double salarioBase, Double adicional) {

        super(nome, cpf, salarioBase);
        this.adicional = adicional;
    }

    @Override
    public Double calcularSalario() {

        return this.salarioBase + this.adicional;
    }
}