package lista05.ex04;

public class Veiculo {
    
    private String placa;

    public Veiculo(String placa) {

        this.placa = placa;
    }

    @Override
    public String toString() {
        
        return "Veiculo [placa=" + placa + "]";
    }
}
