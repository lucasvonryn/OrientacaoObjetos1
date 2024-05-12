package lista4.ex4;

import lista4.ex1.Endereco;

public class Dono {
    
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Dono(String cpf, String nome, String telefone, String email, Endereco endereco) {

        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public void emitirRelatorio() {

        System.out.println("=== DADOS DO DONO ===");
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("Endereço: " + endereco.formatarEndereco());
        System.out.println("=====================");
    }
}
