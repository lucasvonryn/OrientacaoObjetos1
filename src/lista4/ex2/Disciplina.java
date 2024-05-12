package lista4.ex2;

public class Disciplina {
    
    private int codigo;
    private String nome;
    private String modalidade;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, Professor professor) {
        
        this.codigo = codigo;
        this.nome = nome;
        this.modalidade = modalidade;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public void emitirRelatorio() {

        System.out.println("Código: " + codigo);
        System.out.println("Nome da disciplina: " + nome);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Professor: " + professor.emitirRelatorio());
    }
}
