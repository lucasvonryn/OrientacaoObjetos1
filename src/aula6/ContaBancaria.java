package aula6;

public class ContaBancaria {
    
    int numeroConta;
    String nomeTitular;
    Double saldo;
    static int contContas;

    public void abrirConta(String titular) {

        this.numeroConta = ++contContas;
        this.nomeTitular = titular;
    }

    public void depositar(int valor) {

        this.saldo += valor;
    }

    public void sacar(int valor) {

        this.saldo -= valor;
    } 

    public String toString() {

        return "Número da conta: " + this.numeroConta + "\nTítular: " + this.nomeTitular + "\n";
    }
}
