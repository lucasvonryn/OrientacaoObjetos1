package aula13.heranca.exemplo02;

public class ProfessorTeste {
    
    public static void main(String[] args) {
        
        Professor professor1 = new Professor(1, "Lucas", "10/02/2024", 1458);
        professor1.imprimirDadosProfessor();
        professor1.aplicarAvaliacao();
        professor1.lancarFrequencia();

        System.out.println("==========================");

        CoordenadorCurso coordenadorCurso1 = new CoordenadorCurso(2, "Rogério", "25/05/2023", 2584, 654);
        coordenadorCurso1.imprimirDadosCoordenador();
        coordenadorCurso1.aplicarAvaliacao();
        coordenadorCurso1.lancarFrequencia();
        coordenadorCurso1.analisarPedidoSegundaChamada();
        coordenadorCurso1.analisarPedidoSuficiencia();
        coordenadorCurso1.participarReunioesDirecao();
    }
}
