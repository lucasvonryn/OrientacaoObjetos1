package lista1.Ex3;

public class NetebookTeste {
    
    public static void main(String[] args) {
        
        Notebook notebook1 = new Notebook();

        notebook1.marca = "Acer";
        notebook1.modelo = "ES1";
        notebook1.polegadasTela = 15.6;
        notebook1.modeloProcessador = "Pentium";
        notebook1.quantidadeRam = 4;
        notebook1.capacidadeArmazenamento = "500GB";

        System.out.println("\n======= Notebook 1 =======");
        System.out.println("Marca: " + notebook1.marca);
        System.out.println("Modelo: " + notebook1.modelo);
        System.out.println("Polegadas: " + notebook1.polegadasTela);
        System.out.println("Modelo do processador: " + notebook1.modeloProcessador);
        System.out.println("Quantidade de memória RAM: " + notebook1.quantidadeRam);
        System.out.println("Capacidade de armazenamento: " + notebook1.capacidadeArmazenamento);
    }
}
