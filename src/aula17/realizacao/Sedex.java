package aula17.realizacao;

public class Sedex implements Frete {
    
    @Override
    public double calcularFrete(int distancia) {
        
        return 17.00 + (distancia * 0.45);
    }
}
