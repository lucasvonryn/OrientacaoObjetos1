package aula02.entradadados;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int maiorValor = 0;

        System.out.println("Informe o primeiro valor: ");
        int valor1 = input.nextInt();

        System.out.println("Informe o segundo valor: ");
        int valor2 = input.nextInt();

        System.out.println("Informe o terceiro valor: ");
        int valor3 = input.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {

            maiorValor = valor1;

        } else if (valor2 > valor1 && valor2 > valor3) {
            
            maiorValor = valor2;

        } else if (valor3 > valor1 && valor3 > valor2) {

            maiorValor = valor3;

        }

        System.out.printf("O maior valor informado é: %d\n", maiorValor);

        input.close();
    }
}
