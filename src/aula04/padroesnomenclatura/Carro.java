package aula04.padroesnomenclatura;

public class Carro {
    
    // Declarar atributos da classe
    String modelo;
    String marca;
    int ano;
    String placa;
    String cor;
    boolean ligado = false;
    int velocidade = 0;

    // Declarar os métodos da classe (funções e procedimentos em C)
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

            ligado = false;

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

    public void imprimirDados () {

        System.out.println("==================");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("==================");
    }

    @Override
    public String toString() {

        return modelo + " " + marca + " " + ano + " " + placa + " " + cor;
    }
}
