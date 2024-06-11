package lista4.ex1;

public class CadastroFuncionarioTeste {
    
    public static void main(String[] args) {
        
        Endereco endereco1 = new Endereco("Rua das Flores", 123, "Centro", "São Paulo", "SP");

        Funcionario funcionario1 = new Funcionario(1001, "João Silva", "02/12/2002", "Masculino", "TI", "6546846232", endereco1);

        funcionario1.emitirRelatorio();
    }
}
