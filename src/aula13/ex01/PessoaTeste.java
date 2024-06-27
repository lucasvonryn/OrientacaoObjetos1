package aula13.ex01;

public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Rogério", 54, 1658, 845);
        professor1.imprimirDados();

        Aluno aluno1 = new Aluno("Lucas", 19, "ADS");
        aluno1.imprimirDados();
        aluno1.realizarMatricula("BCC");
        aluno1.imprimirDados();
    }
}
