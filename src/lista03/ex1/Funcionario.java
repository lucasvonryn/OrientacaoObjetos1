package lista3.ex1;

public class Funcionario {

	private int numReg;
	private String nomeCompleto;
	private String dataNasc;
	private String sexo;
	private String setor;
	private String tel;
	private String rua;
	private int numCasa;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Funcionario(int numReg, String nomeCompleto, String dataNasc, String sexo, String setor, String tel) {
		
		this.numReg = numReg;
		this.nomeCompleto = nomeCompleto;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.setor = setor;
		this.tel = tel;
	}
	
	public void cadastrarEndereco(String rua, int numCasa, String bairro, String cidade, String estado) {
		
		this.rua = rua;
		this.numCasa = numCasa;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void emitirRelatorio() {
		
		System.out.println("====================================");
		System.out.println("RELATÓRIO DE FUNCIONÁRIO");
		System.out.println("Número de registro: " + this.numReg);
		System.out.println("Nome completo: " + this.nomeCompleto);
		System.out.println("Data de nascimento: " + this.dataNasc);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor de trabalho: " + this.setor);
		System.out.println("Telefone: " + this.tel);
		System.out.println("Rua: " + this.rua);
		System.out.println("Número da casa: " + this.numCasa);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Estado: " + this.estado);
		System.out.println("====================================\n");
	}
}
