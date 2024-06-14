package lista05.ex01;

public class BancoTeste {
    
    public static void main(String[] args) {

        Titular titular = new Titular("Lucas", "1231535132");
        Conta conta = new Conta(123, titular);

        System.out.println(conta);
        
        Banco banco = new Banco();
        banco.adicionarConta(conta);
        
        banco.depositar(1, 120.00);
        banco.depositar(123, 120.00);
        
        System.out.println(conta);
        
        banco.sacar(1, 110.00);
        banco.sacar(123, 123.00);
        banco.sacar(123, 110.00);

        System.out.println(conta);

        banco.depositar(123, 3.00);
        banco.consultarSaldo(1);
        banco.consultarSaldo(123);
    }
}
