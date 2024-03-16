package lista1.Ex5;

public class Calculadora {
    
    String marca;
    String modelo;
    String tipo;
    String memoriaInterna;
    boolean ligado;

    public void ligar() {

        this.ligado = true;
        System.out.println("Calculadora ligada.");

    }

    public void desligar() {
        
        this.ligado = false;
        System.out.println("Calculadora desligada.");

    }

    public void somar(int x, int y) {
        
        if (ligado) {
            System.out.println(x + y);
        } else {
            System.out.println("Ligue a calculadora para fazer uma operação.");
        }

    }

    public void subtrair(int x, int y) {

        if (ligado) {
            System.out.println(x - y);
        } else {
            System.out.println("Ligue a calculadora para fazer uma operação.");
        }

    }

    public void multiplicar(int x, int y) {

        if (ligado) {
            System.out.println(x * y);
        } else {
            System.out.println("Ligue a calculadora para fazer uma operação.");
        }

    }

    public void dividir(int x, int y) {

        if (ligado) {
            System.out.println(x / y);
        } else {
            System.out.println("Ligue a calculadora para fazer uma operação.");
        }

    }
}
