package lista02.ex3;

public class Notebook {
    
    String marca;
    String modelo;
    Double polegadasTela;
    String modeloProcessador;
    int quantidadeRam;
    String capacidadeArmazenamento;
    boolean ligado = false;

    public void ligar() {

        if (this.ligado == false) {
            
            this.ligado = true;

            System.out.println(this.modelo + " está ligando.");

        } else {

            System.out.println(this.modelo + " já está ligado.");

        }
    }

    public void desligar() {
        
        if (this.ligado == true) {

            this.ligado = false;

            System.out.println(this.modelo + " está desligando.");

        } else {

            System.out.println(this.modelo + " já está desligado.");

        }
    }

    public void processarInformacoes() {
        
        System.out.println(this.modelo + " está processando informações.");
    }
    
    public void conectarInternet() {
        
        System.out.println(this.modelo + " está se conectando à internet.");
    }
}
