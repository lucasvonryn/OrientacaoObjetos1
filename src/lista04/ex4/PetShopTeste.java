package lista4.ex4;

import java.time.LocalDate;

public class PetShopTeste {
    
    public static void main(String[] args) {

        // Criação do endereço do dono
        Endereco endereco = new Endereco("Rua Doutor Colares", 219, "Centro", "Ponta Grossa", "Paraná");

        // Criação do dono
        Dono dono = new Dono("12345678977", "Lucas", "4545454545", "lucas@gmail.com", endereco);

        // Criação do animal
        Animal animal = new Animal("Thor", 4, "Macho", dono);

        // Criação dos tratamentos
        Tratamento tratamento1 = new Tratamento("Banho e tosa", "13/06/2024");
        Tratamento tratamento2 = new Tratamento("Vacinação", "13/06/2024", "14/06/2024");

        // Adicionando tratamentos ao animal
        animal.addTratamento(tratamento1);
        animal.addTratamento(tratamento2);

        // Exibindo informações
        System.out.println(animal);
        for (Tratamento t : animal.getTratamentos()) {
            System.out.println(t);
        }
    }
}
