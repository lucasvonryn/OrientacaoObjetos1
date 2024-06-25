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

            // Se a vaga não estiver ocupada...
            if (!vaga.getOcupada()) {
                
                vaga.setVeiculo(veiculo);
                vaga.setOcupada(true);
                vaga.setHoraEntrada(horaEntrada);

                System.out.println("Vaga " + vaga.getIdVaga() + " alocada com sucesso!");
                return;
            }
        }

        System.out.println("Nenhuma vaga está disponível no momento.");
    }

    public void retirarVeiculo(Veiculo veiculo, int horaSaida) {


    }

    public void calcularContaEstacionamento() {


    }

    public void adicionarVaga(Vaga vaga) {

        vagas.add(vaga);
    }
}
