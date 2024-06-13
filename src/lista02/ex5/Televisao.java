package lista2.ex5;

public class Televisao {
    
    String marca;
    int polegadas;
    String resolucao;
    int canal = 10;
    int volume;
    boolean ligada = false;

    public void ligar() {

        if (this.ligada) {

            System.out.println("\n" + this.marca + " já está ligada.");

        } else {

            this.ligada = true;
            System.out.println("\n" + this.marca + " está ligando.");

        } 
    }

    public void desligar() {

        if (!this.ligada) {

            System.out.println("\n" + this.marca + " já está deligada.");

        } else {

            this.ligada = false;
            System.out.println("\n" + this.marca + " está desligando.");

        }
    }

    public void aumenarCanal() {

        this.canal++;
        System.out.println("\nCanal aumentado.");
        System.out.println("Canal atual: " + this.canal);
    }

    public void diminuirCanal() {

        this.canal--;
        System.out.println("\nCanal diminuido.");
        System.out.println("Canal atual: " + this.canal);
    }

    public void aumentarVolume() {
    
        this.volume++;
        System.out.println("\nVolume aumentado.");
        System.out.println("Volume atual: " + this.volume);
    }

    public void abaixarVolume() {

        this.volume--;
        System.out.println("\nVolume diminuido.");
        System.out.println("Volume atual: " + this.volume);
    }

    public void exibirRelatorio() {

        System.out.println("\n==== RELATÓRIO DA TV ====");
        System.out.println("Marca: " + this.marca);
        System.out.println("Polegadas: " + this.polegadas);
        System.out.println("Resolução: " + this.resolucao);

        if (this.ligada) {

            System.out.println("Canal atual: " + this.canal);
            System.out.println("Volume atual: " + this.volume);

        } else {

            System.out.println("Canal atual: Desligada.");
            System.out.println("Volume atual: Desligada.");

        }

        System.out.println("=========================");
    }
}
