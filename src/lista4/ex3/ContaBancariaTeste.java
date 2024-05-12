package lista4.ex3;

public class ContaBancariaTeste {
    
    public static void main(String[] args) {
        
        Endereco endereco1 = new Endereco("Casa", 123, "Jardim", "Irati", "Paraná");

        Titular titular1 = new Titular("21354663213", "654231", "José", "01/04/1998", "Masculino", 6547.12, endereco1);

        ContaBancaria contaBancaria1 = new ContaBancaria(111, titular1);

        contaBancaria1.emitirRelatorio();
    }
}
