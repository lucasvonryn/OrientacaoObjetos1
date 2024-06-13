package aula01.primeiroprograma;

public class SaidaDados {

    public static void main(String[] args) {
        
        String nome = "Lucas Gabriel";
        int idade = 18;
        double peso = 69.9;

        // println (print line)
        System.out.println(nome + " possui " + idade + " anos e " + peso + " Kg.");

        // print
        System.out.print(nome + " possui " + idade + " anos e " + peso + " Kg.\n");

        // printf
        System.out.printf("%s possui %d anos e %.2f Kg.", nome, idade, peso);
    }
}
