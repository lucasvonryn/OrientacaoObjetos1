package lista4.ex1;

public class Funcionario {
    
    private int numReg;
    private String nomeCompleto;
    private String dataNascimento;
    private String sexo;
    private String setor;
    private String telefone;
    private Endereco endereco;


    public Funcionario(int numReg, String nomeCompleto, String dataNascimento, String sexo, String setor, String telefone, Endereco endereco) {

        this.numReg = numReg;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void emitirRelatorio() {
        System.out.println("Número de Registro: " + numReg);
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Setor: " + setor);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco.formatarEndereco());
    }
}
