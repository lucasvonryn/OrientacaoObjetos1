package lista05.ex01;

public class Titular {
    
    private String nome;
    private String cpf;

    public Titular(String nome, String cpf) {

        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {

        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
