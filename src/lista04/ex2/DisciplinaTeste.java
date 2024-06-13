package lista04.ex2;

public class DisciplinaTeste {
    
    public static void main(String[] args) {

        Professor professor1 = new Professor(101, "Roberto", "01/04/2203", 2415.65);

        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Presencial", 50, professor1);

        disciplina1.emitirRelatorio();
    }
}
