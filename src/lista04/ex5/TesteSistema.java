package lista04.ex5;

public class TesteSistema {
    
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua Doutor Colares", 219, "Centro", "Ponta Grossa", "Paraná");
        Local local = new Local("Centro de Eventos", endereco, 50);
        Artista artista = new Artista("Lucas", "Brasileiro", "papapapapappapa");
        Evento evento = new Evento("SóTrackBoa", artista, "01/04/2005", local, 18);

        SistemaVendaIngressos sistema = new SistemaVendaIngressos();
        sistema.adicionarEvento(evento);

        System.out.println("Lista de eventos: ");
        sistema.listarEventos();

        sistema.comprarIngressos(evento, 35);
        sistema.comprarIngressos(evento, 26);
    }
}
