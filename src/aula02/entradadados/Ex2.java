package aula02;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor total da compra: ");
        double valorTotal = input.nextDouble();

        double valorFinal = valorTotal >= 50 ? valorTotal * 0.1 : valorTotal * 0.05;

        System.out.println("O valor de desconto foi de R$" + valorFinal);

        input.close();
    }
}
