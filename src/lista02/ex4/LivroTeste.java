package lista02.ex4;

import java.util.Scanner;

public class LivroTeste {
    
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.titulo = "Anne Frank";
        livro1.autor = "João";
        livro1.editora = "Intreseco";
        livro1.numPaginas = 231;
        livro1.anoPublicacao = 2018;

        livro2.titulo = "Percy Jackson";
        livro2.autor = "Maria";
        livro2.editora = "Heheh";
        livro2.numPaginas = 339;
        livro2.anoPublicacao = 2015;

        livro1.devolverLivro();

        livro1.exibirDados();
        
        livro2.emprestarLivro();

        livro2.devolverLivro();

        livro1.exibirDados();
        livro2.exibirDados();
    }
}
