package lista2.ex3;

public class NotebookTeste {
    
    public static void main(String[] args) {
        
        Notebook notebook1 = new Notebook();
        Notebook notebook2 = new Notebook();

        notebook1.marca = "Acer";
        notebook1.modelo = "ES1";
        notebook1.polegadasTela = 15.6;
        notebook1.modeloProcessador = "Pentium";
        notebook1.quantidadeRam = 8;
        notebook1.capacidadeArmazenamento = "500GB";

        notebook2.marca = "Dell";
        notebook2.modelo = "Inspiron";
        notebook2.polegadasTela = 15.6;
        notebook2.modeloProcessador = "i7";
        notebook2.quantidadeRam = 16;
        notebook2.capacidadeArmazenamento = "1TB";

        
    }
}
