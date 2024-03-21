package aula3;

public class PessoaTeste {

    public static void main(String[] args) {

        // Instanciar objetos da classe pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        // Atribuir valores para os atributos de cada pessoa
        pessoa1.nome = "João";
        pessoa1.idade = 25;
        pessoa1.peso = 68.5;

        pessoa2.nome = "Maria";
        pessoa2.idade = 39;
        pessoa2.peso = 55.6;

        pessoa3.nome = "José";
        pessoa3.idade = 32;
        pessoa3.peso = 62.4;

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

        // pessoa1.andar();
        // pessoa3.andar();

        // pessoa2.falar();

        // pessoa3.correr();

        // pessoa1.imprimirDados();
        // pessoa2.imprimirDados();
        // pessoa3.imprimirDados();


        // Buscando os valores atribuidos a cada objeto
        // System.out.println("\n========= Pessoa 1 =========");
        // System.out.println("Nome: " + pessoa1.nome);
        // System.out.println("Idade: " + pessoa1.idade);
        // System.out.println("Peso: " + pessoa1.peso);
    }
}