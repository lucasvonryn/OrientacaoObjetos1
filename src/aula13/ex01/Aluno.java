package aula13.ex01;

public class Aluno extends Pessoa {
    
    private String curso;

    public Aluno(String nome, int idade, String curso) {

        super(nome, idade);
        this.curso = curso;
    }

    public void realizarMatricula(String curso) {

        this.curso = curso;
        System.out.println(this.nome + " realizou a matrícula no curso " + this.curso);
    }

    public void imprimirDados() {

        super.imprimirDados();

        System.out.println("Curso matriculado: " + this.curso);
    }
}
