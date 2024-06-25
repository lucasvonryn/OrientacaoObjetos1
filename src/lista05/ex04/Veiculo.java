package lista05.ex04;

public class Veiculo {
    
    private String placa;
    private boolean estacionado;

    public Veiculo(String placa) {

        this.placa = placa;
        this.estacionado = false;
    }

    public boolean getEstacionado() {

        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {

        this.estacionado = estacionado;
    }

    public String getPlaca() {

        return placa;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", estacionado=" + estacionado + "]";
    }
}
