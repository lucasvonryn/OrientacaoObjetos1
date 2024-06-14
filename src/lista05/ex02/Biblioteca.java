package lista05.ex02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca() {

        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {

        livros.add(livro);
    }

    public void verificarDiponibilidade(String titulo) {

        for (Livro livro : livros) {

            if (livro.getTitulo() == titulo) {
                
                if (livro.getDisponibilidade()) {
                    System.out.println("Livro disponível.");
                } else {
                    System.out.println("Livro indisponível.");
                }
            } else {
                System.out.println("Livro não encontrado.");
            }
        }
    }

    public void emprestarLivro(String titulo, int diaEmprestimo) {

        for (Livro livro : livros) {

            if (livro.getTitulo() == titulo) {
                
                if (livro.getDisponivel()) {
                    livro.setDisponivel(false);
                    livro.setDiaEmprestimo(diaEmprestimo);
                    System.out.println("Livro disponível. Emprestado com sucesso!");
                } else {
                    System.out.println("Livro indisponível para impréstimo.");
                }
            } else { 
                System.out.println("Livro não encontrado.");
            }
        }
    }

    public void devolverLivro(String titulo, int diaDevolucao) {

        for (Livro livro : livros) {

            if (livro.getTitulo() == titulo) {
                
                if (!livro.getDisponivel()) {
                    
                } else {
                    System.out.println("Livro já está disponível. Não é possível devolve-lo.");
                }
            } else {
                System.out.println("Livro não encontrado.");
            }
        }
    }
}
