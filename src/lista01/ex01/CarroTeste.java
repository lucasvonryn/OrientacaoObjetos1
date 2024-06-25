package lista01.ex01;

public class CarroTeste {
    
    public static void main(String[] args) {
        
        // Instanciar objetos da classe carro

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // Atribuir valores para os atributos de cada carro

        carro1.modelo = "911";
        carro1.marca = "Porsche";
        carro1.ano = 2017;
        carro1.placa = "XXX-5555";
        carro1.cor = "Branco";

        carro2.modelo = "Gol";
        carro2.marca = "Volkswagen";
        carro2.ano = 2010;
        carro2.placa = "YYY-3333";
        carro2.cor = "Vermelho";

        // Buscando os valores atribuidos a cada objeto

        System.out.println("\n========= Carro 1 =========");
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Placa: " + carro1.placa);
        System.out.println("Cor: " + carro1.cor);
        
        System.out.println("\n========= Carro 2 =========");
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Placa: " + carro2.placa);
        System.out.println("Cor: " + carro2.cor);
    }
}
