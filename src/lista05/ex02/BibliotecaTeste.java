package lista05.ex02;

public class BibliotecaTeste {
    
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("titulo1", "autor1", 2020, "editora1", 120);
        Livro livro2 = new Livro("titulo2", "autor2", 2017, "editora2", 100);
        Livro livro3 = new Livro("titulo3", "autor3", 5221, "editora3", 654);
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.emprestarLivro("titulo", 1);
    }
}
