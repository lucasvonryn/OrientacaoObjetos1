package lista04.ex4;

public class Tratamento {
    
    private String descricao;
    private String dataInicio;
    private String dataFim;

    public Tratamento(String descricao, String dataInicio, String dataFim) {

        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Tratamento(String descricao, String dataInicio) {

        this(descricao, dataInicio, null);
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {

        this.dataInicio = dataInicio;
    }

    public String getDataFim() {

        return dataFim;
    }

    public void setDataFim(String dataFim) {

        this.dataFim = dataFim;
    }

    @Override
    public String toString() {

        return "Tratamento: " + descricao + ", Inicio: " + dataInicio + ", Fim: " + (dataFim != null ? dataFim : "Em andamento");
    }
}
