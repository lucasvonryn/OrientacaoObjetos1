package lista04.ex5;

public class Artista {
    
    private String nome;
    private String nacionalidade;
    private String biografia;

    public Artista(String nome, String nacionalidade, String biografia) {

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.biografia = biografia;
    }

    @Override
    public String toString() {

        return nome + " (" + nacionalidade + ") - Biografia: " + biografia;
    }
}
