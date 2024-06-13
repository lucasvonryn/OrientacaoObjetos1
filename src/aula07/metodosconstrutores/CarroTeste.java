package aula07.metodosconstrutores;

public class CarroTeste {
    
    public static void main(String[] args) {
        
        // Instanciar objetos da classe carro
        Carro carro1 = new Carro("Gol", "Volkswagen", 2022, "ABC-1234", "Vermelho");
        Carro carro2 = new Carro("Chevrolet", "Ônix", 2024, "MNO-9812", "Preto");
        Carro carro3 = new Carro("ANO-4151");
        
        // Imprimir os dados dos objetos
        carro1.imprimirDados();
        carro2.imprimirDados();
        carro3.imprimirDados();
    }
}