package lista05.ex04;

public class Vaga {
    
    private int idVaga;
    private Veiculo veiculo;
    private boolean ocupada;

    public Vaga(int idVaga) {

        this.idVaga = idVaga;
        this.ocupada = false;
    }

    public int getIdVaga() {

        return idVaga;
    }

    public void setVeiculo(Veiculo veiculo) {

        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {

        return veiculo;
    }

    public void setOcupada(boolean ocupada) {

        this.ocupada = ocupada;
    }

    public boolean getOcupada() {

        return ocupada;
    }
}
