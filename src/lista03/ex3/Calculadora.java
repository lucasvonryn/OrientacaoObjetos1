package lista3.ex3;

public class Calculadora {
    
    private String marca;
    private String modelo;
    private String tipo;
    private int memoriaInterna;

    public Calculadora(String marca, String modelo, String tipo, int memoriaInterna) {

        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.memoriaInterna = memoriaInterna;
    }

    public Double somar(Double x, Double y) {

        return x + y;
    }

    public Double subtrair(Double x, Double y) {

        return x - y;
    }

    public Double multiplicar(Double x, Double y) {

        return x * y;
    }

    public Double dividir(Double x, Double y) {

        return x / y;
    }

    public String getMarca() {

        return this.marca;
    }
    
    public String getModelo() {

        return this.modelo;
    }
    
    public String getTipo() {

        return this.tipo;
    }

    public int getMemoriaInterna() {

        return this.memoriaInterna;
    }
}
