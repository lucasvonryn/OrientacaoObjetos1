package lista01.ex04;

public class AlunoTeste {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();

        aluno1.ra = "2613573";
        aluno1.nome = "Lucas Gabriel Von Ryn";
        aluno1.curso = "ADS";
        aluno1.turno = "Noturno";
        aluno1.periodo = 2;
        aluno1.coeficiente = 0.9711;
        aluno1.situacao = "Regular";

        aluno1.imprimirRelatorio();
    }
}
