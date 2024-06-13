package aula06.variaveis;

public class CarroTeste {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.modelo = "Gol";
        carro1.marca = "Volkswagen";

        carro1.acelerar(50);
        carro1.acelerar(130);
        carro1.acelerar(30);

        carro1.frear(180);
        carro1.frear(10);
    }
}
