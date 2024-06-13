package lista3.ex1;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario(1, "Lucas Ryn", "01/04/2005", "Masculino", "Adm", "42984359531");
		
		func1.emitirRelatorio();
		
		func1.cadastrarEndereco("Piriquitos", 14, "Rio Bonito", "Irati", "Paraná");
		
		func1.emitirRelatorio();
	}
}
