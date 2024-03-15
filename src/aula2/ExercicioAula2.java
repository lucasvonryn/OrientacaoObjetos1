package aula2;

import java.util.Scanner;

public class ExercicioAula2 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = input.nextLine();
		
		System.out.println("Sexo: ");
		String sexo = input.nextLine();
		
		System.out.println("Estado civil: ");
		String estadoCivil = input.nextLine();
		
		System.out.println("Quantidade de filhos: ");
		int qtdFilhos = input.nextInt();
		
		input.nextLine(); // Faz a limpeza do buffer
		
		System.out.println("Escolaridade: ");
		String escolaridade = input.nextLine();
		
		System.out.println("Renda mensal: ");
		Double rendaMensal = input.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Escolaridade: " + escolaridade);
		System.out.println("Renda mensal: " + rendaMensal);

		input.close();
	}
}
