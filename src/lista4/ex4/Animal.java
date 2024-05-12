package lista4.ex4;

public class Animal {
    
    private String nome;
    private int idade;
    private String sexo;
    private Dono dono;
    private Tratamento tratamento;

    public Animal(String nome, int idade, String sexo, Dono dono, Tratamento tratamento) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dono = dono;
        this.tratamento = tratamento;
    }

    public void emitirRelatorio() {

        System.out.println("Nome do animal: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        dono.emitirRelatorio();
        tratamento.emitirRelatorio();
    }
}
