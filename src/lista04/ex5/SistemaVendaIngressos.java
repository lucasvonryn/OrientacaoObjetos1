package lista04.ex5;

import java.util.ArrayList;
import java.util.List;

public class SistemaVendaIngressos {
    
    private List<Evento> eventos;

    public SistemaVendaIngressos() {

        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {

        eventos.add(evento);
    }

    public void listarEventos() {

        for (Evento evento : eventos) {
            System.out.println(evento);
            System.out.println("----------------------------------");
        } 
    }

    public void comprarIngressos(Evento evento, int quantidade) {

        System.out.println("Tentando efetuar a compra de " + quantidade + " ingressos...");
        if (evento.checarDisponibilidadeIngressos(quantidade)) {
            System.out.println("Venda efetuada com sucesso!");
        } else {
            System.out.println("Quantidade de ingressos indispível.");
        }
    }
}
