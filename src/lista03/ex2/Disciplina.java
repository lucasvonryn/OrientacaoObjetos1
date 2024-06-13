package lista03.ex2;

public class Disciplina {
    
    private int codigo;
    private String nome;
    private String modalidade;
    private int cargaHoraria;
    private String conteudoProgram;

    public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, String conteudoProgram) {

        this.codigo = codigo;
        this.nome = nome;
        this.modalidade = modalidade;
        this.cargaHoraria = cargaHoraria;
        this.conteudoProgram = conteudoProgram;
    }

    public void emitirRelatorio() {
		
		System.out.println("====================================");
		System.out.println("RELATÓRIO DE DISCIPLINA");
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Carga horária: " + this.cargaHoraria);
		System.out.println("Conteúdo programático: " + this.conteudoProgram);
		System.out.println("====================================\n");
	}
}
