package lista3.ex3;

public class CalculadoraTeste {
    
    public static void main(String[] args) {

        Calculadora calc1 = new Calculadora("Cassio", "GT98", "Ciêntífica", 256);

        System.out.println(calc1.somar(2.0, 2.0));
        System.out.println(calc1.subtrair(4.0, 2.0));
        System.out.println(calc1.multiplicar(6.0, 2.0));
        System.out.println(calc1.dividir(8.0, 2.0));

        System.out.println(calc1.getMarca());
    }
}
