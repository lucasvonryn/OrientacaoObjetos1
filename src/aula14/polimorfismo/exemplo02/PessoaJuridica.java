package aula14.polimorfismo.exemplo02;

public class PessoaJuridica {
    
    private String cnpj;

    public void validarDocumento() {

        System.out.println("Validando CNPJ.");
    }

    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + "]";
    }
}
