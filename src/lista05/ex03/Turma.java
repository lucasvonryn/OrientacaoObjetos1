package lista05.ex03;

public class Turma {
    
    private String nome;
    private Aluno[] alunos;

    public Turma(String nome, Aluno[] alunos) {

        this.nome = nome;
        this.alunos = alunos;
    }

    public void calcularMediaAlunos() {

        for (Aluno aluno : alunos) {

            double media = aluno.calcularMedia();
            String situacao = media >= 6 ? "Aprovado" : "Reprovado";
            System.out.println("Aluno: " + aluno.getNome() + " - Média: " + media + " - Situação: " + situacao);
        }
    }

    public void calcularMediaTurma() {

        double somaMedia = 0;
        
        for (Aluno aluno : alunos) {

            somaMedia += aluno.calcularMedia();
        }
        double mediaTurma = somaMedia / alunos.length;
        System.out.println("Nome da turma: " + nome + "\nMédia da turma: " + mediaTurma);
    }
}
