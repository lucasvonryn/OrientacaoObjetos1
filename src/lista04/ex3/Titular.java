package lista4.ex3;

public class Titular {
    
    private String cpf;
    private String rg;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private Double rendaMensal;
    private Endereco endereco;

    public Titular(String cpf, String rg, String nome, String dataNascimento, String sexo, Double rendaMensal, Endereco endereco) {

        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.rendaMensal = rendaMensal;
        this.endereco = endereco;
    }

    public void emitirRelatorio() {

        System.out.println("=== DADOS DO TITULAR ===");
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Renda mensal: " + rendaMensal);
        System.out.println("Endereço: " + endereco.formatarEndereco());
    }
}
