package lista1.Ex5;

public class CalculadoraTeste {
    
    public static void main(String[] args) {
        
        Calculadora calculadora1 = new Calculadora();

        calculadora1.marca = "Casio";
        calculadora1.modelo = "Calcula-2000";
        calculadora1.tipo = "Científica";
        calculadora1.memoriaInterna = "10MB";

        calculadora1.somar(2, 3);
        calculadora1.ligar();
        calculadora1.somar(2, 3);
        calculadora1.multiplicar(2, 3);
    }
}
