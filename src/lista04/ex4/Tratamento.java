package lista4.ex4;

public class Tratamento {
    
    private String descricao;
    private String dataInicio;
    private String dataFim;

    public Tratamento(String descricao, String dataInicio) {

        this.descricao = descricao;
        this.dataInicio = dataInicio;
    }

    public void emitirRelatorio() {

        System.out.println("=== DADOS DO TRATAMENTO ===");
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de início: " + dataInicio);
        System.out.println("Data de fim: " + dataFim);
        System.out.println("===========================");
    }
}
