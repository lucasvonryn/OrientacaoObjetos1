package lista04.ex3;

public class ContaBancaria {
    
    private int numero;
    private Titular titular;
    private Double saldo;

    public ContaBancaria(int numero, Titular titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.00;
    }

    public void sacar(Double valor) {

        if (saldo < valor) {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado.");
        }
    }

    public void depositar(Double valor) {

        saldo += valor;
        System.out.println("Deposito realizado.");
    }

    public void emitirRelatorio() {

        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo: " + saldo);
        titular.emitirRelatorio();
    }
}