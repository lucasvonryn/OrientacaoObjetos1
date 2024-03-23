package aula6;

public class ContaBancariaTeste {
    
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        ContaBancaria conta3 = new ContaBancaria();
        
        conta1.abrirConta("Lucas Gabriel Von Ryn");
        conta2.abrirConta("Everton da Silva");
        conta3.abrirConta("Amilton Ferreira");

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
    }
}
