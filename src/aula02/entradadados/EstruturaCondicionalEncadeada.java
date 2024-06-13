package aula02.entradadados;

import java.util.Scanner;

public class EstruturaCondicionalEncadeada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua média final: ");
        double mediaFinal = input.nextDouble();

        if (mediaFinal >= 6.0) {

            System.out.println("Você está aprovado.");

        } else if (mediaFinal >= 4.0) {

            System.out.println("Você está de recuperação.");

        } else {

            System.out.println("Você está reprovado.");

        }

        input.close();
    }
}
