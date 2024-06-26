package lista05.ex04;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    
    private List<Vaga> vagas;

    public Estacionamento() {

        this.vagas = new ArrayList<>();
    }

    public void estacionarVeiculo(Veiculo veiculo, int horaEntrada) {

        for (Vaga vaga : vagas) {
            // Se a vaga estiver ocupada, passa para a próxima iteração, senão, cai no else
            if (vaga.getOcupada()) {
                continue;
            } else {
                // Se o veículo já estiver estacionado, passa para a próxima iteração, senão, cai no else
                if (veiculo.getEstacionado()) {
                    continue;
                } else {
                    vaga.setOcupada(true);
                    vaga.setVeiculo(veiculo);
                    veiculo.setHoraEntrada(horaEntrada);
                    veiculo.setEstacionado(true);
                    System.out.println("Vaga " + vaga.getIdVaga() + " ocupada com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Nenhuma vaga disponível ou seu veículo já está estacionado.");
    }

    public void retirarVeiculo(Veiculo veiculo, int horaSaida) {

        
    }

    // Calcula o valor a pagar pelo tempo que o veículo ficou no estacionamento
    public void calcularContaEstacionamento(Veiculo veiculo) {

        int totalHora;
        double valorTotal;

        totalHora = veiculo.getHoraSaida() - veiculo.getHoraEntrada();

        if (totalHora <= 3 && totalHora >=0) {
            valorTotal = 3.0;
            System.out.println("O veículo de placa " + veiculo.getPlaca() + " ficou estacionado " + totalHora + ". Total a pagar: R$ " + valorTotal);
        }

        if (totalHora > 3) {
            valorTotal = ((totalHora - 3) * 0.5) + 3;
            System.out.println("O veículo de placa " + veiculo.getPlaca() + " ficou estacionado " + totalHora + ". Total a pagar: R$ " + valorTotal);
        }
    }

    public void adicionarVaga(Vaga vaga) {

        vagas.add(vaga);
    }
}
