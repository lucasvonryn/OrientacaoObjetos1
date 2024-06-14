package lista04.ex5;

public class Evento {
    
    private String nome;
    private Artista artista;
    private String data;
    private Local local;
    private int classificacaoEtaria;
    private int ingressosDisponiveis;
    
    public Evento(String nome, Artista artista, String data, Local local, int classificacaoEtaria) {
                
        this.nome = nome;
        this.artista = artista;
        this.data = data;
        this.local = local;
        this.classificacaoEtaria = classificacaoEtaria;
        this.ingressosDisponiveis = local.getCapacidadeMaxima();
    }

    public boolean checarDisponibilidadeIngressos(int quantidade) {

        if (quantidade > ingressosDisponiveis) {
            return false;
        }

        ingressosDisponiveis -= quantidade;
        return true;
    }

    @Override
    public String toString() {
        return "Evento: " + nome + "\nArtista: " + artista + "\nData: " + data + "\nLocal: " + local + 
               "\nClassificação Etária: " + classificacaoEtaria + "\nIngressos Disponíveis: " + ingressosDisponiveis;
    }
}
