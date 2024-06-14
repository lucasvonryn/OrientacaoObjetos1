package lista05.ex02;

public class Livro {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;
    private int numPaginas;
    private boolean disponivel;
    private int diaEmprestimo;
    private int diaDevolucao;

    public Livro(String titulo, String autor, int anoPublicacao, String editora, int numPaginas) {

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.numPaginas = numPaginas;
        this.disponivel = true;
    }

    public boolean getDisponivel() {
        
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {

        this.disponivel = disponivel;
    }

    public String getTitulo() {

        return this.titulo;
    }

    public void setDiaEmprestimo(int dia) {

        this.diaEmprestimo = dia;
    }

    public void setDiaDevolucao(int dia) {
        
        this.diaDevolucao = dia;
    }
}
