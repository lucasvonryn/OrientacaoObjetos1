package lista3.ex4;

public class ContaBancariaTeste {
    
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria(123, 333, 100.0);

        conta1.depositar(26.5);
        conta1.verificarSaldo();
        conta1.sacar(127.5);
        conta1.sacar(125.5);
        conta1.verificarSaldo();
    }
}
