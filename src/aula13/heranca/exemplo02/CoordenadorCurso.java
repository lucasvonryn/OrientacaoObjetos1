package aula13.heranca.exemplo02;

public class CoordenadorCurso extends Professor {
    
    private double adicionalSalario;

    public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, double salario, double adicionalSalario) {

        super(numeroRegistro, nome, dataNomeacao, salario);
        this.adicionalSalario = adicionalSalario;
    }
    
    public void analisarPedidoSegundaChamada() {

        System.out.println(this.nome + " está analisando pedidos de segunda chamada.");
    }
    
    public void analisarPedidoSuficiencia() {
        
        System.out.println(this.nome + " está analisando pedidos de exames de suficiência.");
    }
    
    public void participarReunioesDirecao() {
        
        System.out.println(this.nome + " está participando de reuniões da direção.");
    }
    
    public void imprimirDadosCoordenador() {
        
        super.imprimirDadosProfessor();

        System.out.println("Adicional de salário: R$ " + this.adicionalSalario);
        System.out.println("Salário total: R$ " + this.calcularSalario());
    }

    private double calcularSalario() {

        return this.salario + this.adicionalSalario;
    }
}
