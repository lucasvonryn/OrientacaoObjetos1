package lista4.ex4;

public class AnimalTeste {
    
    public static void main(String[] args) {
        
        Endereco enderecoDono = new Endereco("Rua XYZ", 123, "Centro", "Cidade A", "Estado A");

        Dono dono = new Dono("123.456.789-00", "João", "99999-9999", "joao@email.com", enderecoDono);
    }
}
