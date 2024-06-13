package lista02.ex5;

public class TelevisaoTeste {
    
    public static void main(String[] args) {
        
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();

        tv1.marca = "Samsung";
        tv1.polegadas = 65;
        tv1.resolucao = "4K";

        tv2.marca = "TCL";
        tv2.polegadas = 70;
        tv2.resolucao = "8K";

        tv1.ligar();
        tv1.ligar();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.diminuirCanal();

        tv2.desligar();

        tv1.exibirRelatorio();
        tv2.exibirRelatorio();
    }
}
