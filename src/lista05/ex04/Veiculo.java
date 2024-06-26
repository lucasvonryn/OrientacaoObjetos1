package lista05.ex04;

public class Veiculo {
    
    private String placa;
    private boolean estacionado;
    private int horaEntrada;
    private int horaSaida;

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

    public int getHoraEntrada() {

        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {

        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {

        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {

        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", estacionado=" + estacionado + "]";
    }
}
