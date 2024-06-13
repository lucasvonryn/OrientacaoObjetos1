package lista04.ex4;

public class Endereco {
    
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    
    public Endereco(String logradouro, int numero, String bairro, String cidade, String estado) {
        
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {

        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {

        this.logradouro = logradouro;
    }

    public int getNumero() {

        return this.numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public String getBairro() {

        return this.bairro;
    }

    public void setBairro(String bairro) {

        this.bairro = bairro;
    }

    public String getCidade() {

        return this.cidade;
    }

    public void setCidade(String cidade) {

        this.cidade = cidade;
    }

    public String getEstado() {

        return this.estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }

    @Override
    public String toString() {
        return logradouro + ", " + numero + ", " + bairro + ", " + cidade + " - " + estado;
    }
}
