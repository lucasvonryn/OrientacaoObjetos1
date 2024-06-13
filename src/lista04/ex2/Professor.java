package lista04.ex2;

public class Professor {
    
    private int registro;
    private String nome;
    private String dataNascimento;
    private Double salario;

    public Professor(int registro, String nome, String dataNascimento, Double salario) {

        this.registro = registro;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String emitirRelatorio() {
        return registro + " - " + nome + ", nascido em " + dataNascimento + " - " + salario;
    }
}
