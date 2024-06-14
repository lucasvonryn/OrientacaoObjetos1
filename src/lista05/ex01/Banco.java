package lista05.ex01;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private List<Conta> contas;

    public Banco() {
        
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {

        contas.add(conta);
    }

    public void sacar(int numeroConta, Double valor) {

        for (Conta conta : contas) {

            if (conta.getNumero() == numeroConta) {

                if (conta.getSaldo() >= valor) {
                    conta.setSaldo(conta.getSaldo() - valor);
                    System.out.println("Saque realizado com sucesso!");
                } else {
                    System.out.println("Valor não dispinível para saque.");
                }
            } else {
                System.out.println("Conta não encontrada.");
            }
        }
    }

    public void depositar(int numeroConta, Double valor) {

        for (Conta conta : contas) {

            if (conta.getNumero() == numeroConta) {
                conta.setSaldo(conta.getSaldo() + valor);
                System.out.println("Depósito realizado com sucesso!");
            } else {
                System.out.println("Conta não encontrada.");
            }
        } 
    }

    public void consultarSaldo(int numeroConta) {

        for (Conta conta : contas) {

            if (conta.getNumero() == numeroConta) {
                System.out.println("Saldo da conta com número - " + numeroConta);
                System.out.println("R$ " + conta.getSaldo());
            } else {
                System.out.println("Conta não encontrada.");
            }
        }
    }
}
