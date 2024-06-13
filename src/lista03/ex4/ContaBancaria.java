package lista03.ex4;

public class ContaBancaria {

    private int numAgencia;
    private int numConta;
    private Double saldo;

    public ContaBancaria(int numAgencia, int numConta, Double saldo) {

        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(Double valor) {

        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void depositar(Double valor) {

        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public void verificarSaldo() {

        System.out.println("Saldo atual: R$" + this.saldo);
    }
    
    public int getNumAgencia() {
        
        return numAgencia;
    }

    public int getNumConta() {

        return numConta;
    }
}