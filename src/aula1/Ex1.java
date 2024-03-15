package aula1;

public class Ex1 {

    public static void main(String[] args) {
        
        String produto1;
        String produto2;
        Double precoProduto1;
        Double precoProduto2;

        produto1 = "Notebook";
        precoProduto1 = 3500.0;

        produto2 = "SSD";
        precoProduto2 = 250.0;

        System.out.println("Produtos: ");
        System.out.printf("%s por apenas R$%.2f\n", produto1, precoProduto1);
        System.out.printf("%s por apenas R$%.2f\n", produto2, precoProduto2);
    }
}
