package aula16.classemetodoabstrato;

public class Horista extends Funcionario {

    private int horasTrabalhadas;
    private Double precoHora;

    public Horista(String nome, int cpf, Double salarioBase, int horasTrabalhadas, Double precoHora) {

        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.precoHora = precoHora;
    }

    @Override
    public Double calcularSalario() {

        return this.salarioBase + (this.horasTrabalhadas * this.precoHora);
    }
}
