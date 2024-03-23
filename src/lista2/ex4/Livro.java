package lista2.ex4;

public class Livro {

    String titulo;
    String autor;
    String editora;
    int numPaginas;
    int anoPublicacao;
    boolean disponivel = true; // Situação
    
    public void exibirDados() {
        
        System.out.println("\n==== DADOS DO LIVRO ====");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Número de páginas: " + this.numPaginas);
        System.out.println("Ano de publicação: " + this.anoPublicacao);

        if (this.disponivel) {

            System.out.println("Situação: Disponível");
            
        } else {
            
            System.out.println("Situação: Indisponível");

        }

        System.out.println("========================");
    }

    public void emprestarLivro() {

        if (this.disponivel) {

            this.disponivel = false;
            System.out.println("Livro emprestado com sucesso.");

        } else {

            System.out.println("Livro indisponível.");

        }
    }

    public void devolverLivro() {

        if (!this.disponivel) {

            this.disponivel = true;
            System.out.println("Livro devolvido com sucesso.");

        } else {

            System.out.println("Este livro já está disponível, não pode ser devolvido.");

        }
    }
}
