package lista05.ex03;

public class TurmaTeste {
    
    public static void main(String[] args) {
        
        Aluno[] alunos = new Aluno[5];
        alunos[0] = new Aluno("001", "Aluno 1", new double[] {7.0, 8.0, 6.0, 9.0});
        alunos[1] = new Aluno("002", "Aluno 2", new double[] {5.0, 4.0, 6.0, 7.0});
        alunos[2] = new Aluno("003", "Aluno 3", new double[] {9.0, 8.0, 10.0, 9.0});
        alunos[3] = new Aluno("004", "Aluno 4", new double[] {3.0, 5.0, 4.0, 6.0});
        alunos[4] = new Aluno("005", "Aluno 5", new double[] {8.0, 7.0, 8.5, 9.0});

        Turma turma = new Turma("Programação Orientada a Objetos", alunos);

        turma.calcularMediaAlunos();
        turma.calcularMediaTurma();
    }
}
