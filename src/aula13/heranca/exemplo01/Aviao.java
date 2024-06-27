package aula13.heranca.exemplo01;

public class Aviao extends Veiculo {

    private int altitudeMaxima;

    public Aviao(String modelo, String fabricante, int ano, int numPassageiros, String combustivel, int altitudeMaxima) {

        super(modelo, fabricante, ano, numPassageiros, combustivel);
        this.altitudeMaxima = altitudeMaxima;
    }

    public void voar() {

        System.out.println(this.getModelo() + " está voando.");
    }

    public int getAltitudeMaxima() {

        return altitudeMaxima;
    }
}
