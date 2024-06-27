package aula13.exemplo01;

public class Carro extends Veiculo {
 
    private int numPortas;

    public Carro(String modelo, String fabricante, int ano, int numPassageiros, String combustivel, int numPortas) {

        super(modelo, fabricante, ano, numPassageiros, combustivel);
        this.numPortas = numPortas;
    }

    public void calibrarPneus() {

        System.out.println(this.getModelo() + " está calibrando os pneus.");
    }

    public int getNumPortas() {

        return numPortas;
    }
}
