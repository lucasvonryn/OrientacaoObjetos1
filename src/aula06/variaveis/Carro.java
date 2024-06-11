package aula06;

public class Carro {
    
    String modelo;
    String marca;
    String cor;
    int ano;
    int renavam;
    int chassi;
    String placa;
    int velocidade;
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

            System.out.println(this.marca + " " + this.modelo + " está desligando.");

        } else {

            System.out.println(this.marca + " " + this.modelo + " já está desligado.");

        }
 
    }

    public void acelerar(int valorVelocidade) {

        int velocidadeAtual = this.velocidade + valorVelocidade;

        if (velocidadeAtual > 200) {

            System.out.println(
                this.marca + " " + this.modelo + " não pode acelerar mais "
                + valorVelocidade + " km/h, pois passará da velocidade máxima."
            );

            return;
        }

        this.velocidade = velocidadeAtual;

        System.out.println(marca + " " + modelo + " está acelerando.");
        System.out.println("Velocidade atual: " + this.velocidade);
    }

    public void frear(int valorVelocidade) {

        int velocidadeAtual = this.velocidade - valorVelocidade;

        if (velocidadeAtual < 0) {

            System.out.println(
                this.marca + " " + this.modelo + " não pode frear mais "
                + valorVelocidade + " km/h, pois chegará a uma velocidade negativa."
            );

            return;
        }

        this.velocidade = velocidadeAtual;

        System.out.println(marca + " " + modelo + " está freando.");
        System.out.println("Velocidade atual: " + this.velocidade);
    }
}
