package lista02.ex1;

public class CarroTeste {
    
    public static void main(String[] args) {
         
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
    
        carro1.modelo = "911";
        carro1.marca = "Porsche";
        carro1.cor = "Branco";
        carro1.ano = 2017;
        carro1.renavam = 12412415;
        carro1.chassi = 1234;
        carro1.placa = "XXX-5555";
        
        carro2.modelo = "Gol";
        carro2.marca = "Volkswagen";
        carro2.cor = "Vermelho";
        carro2.ano = 2010;
        carro2.placa = "YYY-3333";
        carro1.chassi = 5678;

        carro1.ligar();
        carro2.ligar();
        carro1.ligar();

        carro1.desligar();

        carro2.acelerar();

        carro2.frear();
    }
}
