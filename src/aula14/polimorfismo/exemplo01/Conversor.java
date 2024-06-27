package aula14.polimorfismo.exemplo01;

public class Conversor {
    
    public int converter(double valor) {

        return (int) valor;
    }

    public int converter(char valor) {

        return valor;
    }

    public int converter(String valor) {

        return Integer.parseInt(valor);
    }
}
