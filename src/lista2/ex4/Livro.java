package lista2.ex4;

import java.util.Scanner;

public class Livro {

    Scanner input = new Scanner(System.in);
    
    int id;
    static int contID;
    String titulo;
    String autor;
    String editora;
    int numPaginas;
    int anoPublicacao;
    boolean disponivel = true; // Situação

    public void cadastrarLivro() {

        System.out.println("\n==== CADASTRO DE LIVRO ====");

        System.out.println("Título: ");
        this.titulo = input.nextLine();
        
        System.out.println("Autor: ");
        this.autor = input.nextLine();
        
        System.out.println("Editora: ");
        this.editora = input.nextLine();
        
        this.numPaginas = input.nextInt();
        System.out.println("Número de páginas: ");
        
        input.nextLine(); // Limpeza de buffer
        
        System.out.println("Ano de publicação: ");
        this.anoPublicacao = input.nextInt();
    }
    
    public void exibirDados() {
        
        System.out.println("\n==== DADOS DO LIVRO ====");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Número de páginas: " + this.numPaginas);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
    }

    public void emprestarLivro() {

        if (disponivel) {

            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");

        } else {

            System.out.println("Livro indisponível.");

        }
    }

    public void devolverLivro() {

        if (!disponivel) {

            disponivel = true;
            System.out.println("Livro devolvido com sucesso.");

        } else {

            System.out.println("Este livro já está disponível, não pode ser devolvido.");

        }
    }
}
