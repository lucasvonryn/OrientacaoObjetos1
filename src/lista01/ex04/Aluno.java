package lista01.ex04;

public class Aluno {

    String ra;
    String nome;
    String curso;
    String turno;
    int periodo;
    double coeficiente;
    String situacao;
    
    public void imprimirRelatorio() {
        System.out.println("\n======= Relatório =======");
        System.out.println("RA: " + this.ra);
        System.out.println("Nome: " + this.nome);
        System.out.println("Curso: " + this.curso);
        System.out.println("Turno: " + this.turno);
        System.out.println("Período: " + this.periodo);
        System.out.println("Coeficiente: " + this.coeficiente);
        System.out.println("Situação: " + this.situacao);
    }
}
