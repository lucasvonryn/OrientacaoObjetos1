package aula07;

public class PessoaTeste {

    public static void main(String[] args) {

        // Instanciar objetos da classe pessoa
        Pessoa pessoa1 = new Pessoa("Lucas", 18, 71.2);
        Pessoa pessoa2 = new Pessoa("Fernando", 21, 67.8);

        pessoa1.imprimirDados();
        pessoa2.imprimirDados();
    }
}