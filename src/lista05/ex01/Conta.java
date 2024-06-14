package lista05.ex01;

public class Conta {
    
    private int numero;
    private Double saldo;
    private Titular titular;

    public Conta(int numero, Titular titular) {

        this.numero = numero;
        this.saldo = 0.00;
        this.titular = titular;
    }

    public int getNumero() {

        return this.numero;
    }

    public Double getSaldo() {

        return this.saldo;
    }

    public void setSaldo(Double valor) {

        this.saldo = valor;
    }

    public Titular geTitular() {

        return this.titular;
    }

    @Override
    public String toString() {

        return "Numero da conta: " + numero + ", Saldo: " + saldo + "\nTitular - " + titular;
    }
}
