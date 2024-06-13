package lista4.ex4;

public class Dono {
    
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Dono(String cpf, String nome, String telefone, String email, Endereco endereco) {
        
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }    

    @Override
    public String toString() {

        return "Dono: " + nome + " (CPF: " + cpf + "), Tel: " + telefone + ", Email: " + email + ", Endereço: " + endereco;
    }
}
