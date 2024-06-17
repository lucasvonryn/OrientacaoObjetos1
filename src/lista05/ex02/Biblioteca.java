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

        boolean encontrou = false;

        for (Livro livro : livros) {

            if (livro.getTitulo() == titulo) {

                encontrou = true;
                
                if (livro.getDisponivel()) {
                    System.out.println("Livro disponível.");
                } else {
                    System.out.println("Livro indisponível.");
                }
            }
        }

        if (!encontrou) {
            System.out.println("Livro não encontrado.");
        }
    }

    public void emprestarLivro(String titulo, int diaEmprestimo) {

        boolean encontrou = false;

        for (Livro livro : livros) {

            if (livro.getTitulo() == titulo) {

                encontrou = true;
                
                if (livro.getDisponivel()) {
                    livro.setDisponivel(false);
                    livro.setDiaEmprestimo(diaEmprestimo);
                    System.out.println("Livro disponível. Emprestado com sucesso!");
                } else {
                    System.out.println("Livro indisponível para impréstimo.");
                }
            }
        }

        if (!encontrou) {
            System.out.println("Livro não encontrado.");
        }
    }

    public void devolverLivro(String titulo, int diaDevolucao) {

        int totalDias;
        int diasExcedidos;
        boolean encontrou = false;

        for (Livro livro : livros) {

            if (livro.getTitulo() == titulo) {

                encontrou = true;
                
                if (!livro.getDisponivel()) {
                    
                    totalDias = diaDevolucao - livro.getDiaEmprestimo();
                    diasExcedidos = totalDias - 7;

                    if (totalDias <= 7) {
                        livro.setDisponivel(true);
                        System.out.println("Livro devolvido com sucesso!");
                    } else {
                        livro.setDisponivel(true);
                        System.out.println("Você excedeu o prazo máximo para devolução em " + diasExcedidos + " dia(s).");
                        System.out.println("A multa é de R$ 1,50 por dia, total: R$ " + (diasExcedidos * 1.5));
                    }
                } else {
                    System.out.println("Livro já está disponível. Não é possível devolve-lo.");
                }
            }
        }

        if (!encontrou) {
            System.out.println("Livro não encontrado.");
        }
    }
}
