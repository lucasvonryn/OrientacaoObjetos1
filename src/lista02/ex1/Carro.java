package lista2.ex1;

public class Carro {
    
    String modelo;
    String marca;
    String cor;
    int ano;
    int renavam;
    int chassi;
    String placa;
    boolean ligado = false;

    public void ligar() {

        if (this.ligado == false) {
            
            this.ligado = true;

            System.out.println(this.marca + " " + this.modelo + " está ligando.");

        } else {

            System.out.println(this.marca + " " + this.modelo + " já está ligado.");

        }
    }

    public void desligar() {

        if (this.ligado == true) {

            this.ligado = false;

            System.out.println(marca + " " + modelo + " está desligando.");

        } else {

            System.out.println(this.marca + " " + this.modelo + " já está desligado.");

        }
 
    }

    public void acelerar() {

        System.out.println(marca + " " + modelo + " está acelerando.");

    }

    public void frear() {

        System.out.println(marca + " " + modelo + " está freando.");
    }
}
