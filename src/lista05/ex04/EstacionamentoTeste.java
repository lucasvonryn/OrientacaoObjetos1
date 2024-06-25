package lista05.ex04;

public class EstacionamentoTeste {
    
    public static void main(String[] args) {
        
        // Criação do veículo a ser estacionado
        Veiculo veiculo1 = new Veiculo("AAA");
        Veiculo veiculo2 = new Veiculo("BBB");
        Veiculo veiculo3 = new Veiculo("CCC");
        Veiculo veiculo4 = new Veiculo("DDD");

        // Criação de vagas para o estacionamento
        Vaga vaga1 = new Vaga(1);
        Vaga vaga2 = new Vaga(2);
        Vaga vaga3 = new Vaga(3);

        // Criação do estacionamento
        Estacionamento estacionamento1 = new Estacionamento();

        // Adicionando as vagas ao estacionamento
        estacionamento1.adicionarVaga(vaga1);
        estacionamento1.adicionarVaga(vaga2);
        estacionamento1.adicionarVaga(vaga3);

        // Estacionando um veículo na vaga1
        estacionamento1.estacionarVeiculo(veiculo1, 10);
        estacionamento1.estacionarVeiculo(veiculo2, 10);
        estacionamento1.estacionarVeiculo(veiculo3, 10);
        estacionamento1.estacionarVeiculo(veiculo4, 10);
    }
}
