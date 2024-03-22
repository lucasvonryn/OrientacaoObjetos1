package lista2.ex2;

public class PessoaTeste {
    
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "João";
        pessoa1.sexo = "Masculino";
        pessoa1.cpf = "123.123.321-22";
        pessoa1.idade = 18;
        pessoa1.altura = 1.8;
        pessoa1.peso = 71.2;

        pessoa2.nome = "Maria";
        pessoa2.sexo = "Feminino";
        pessoa2.cpf = "012.441.222-12";
        pessoa2.idade = 15;
        pessoa2.altura = 1.46;
        pessoa2.peso = 56.0;

        pessoa1.falar();
        pessoa2.falar();

        pessoa1.andar();
        pessoa2.andar();

        pessoa1.correr();
        pessoa2.correr();

        pessoa1.dormir();
        pessoa2.dormir();
    }
}
