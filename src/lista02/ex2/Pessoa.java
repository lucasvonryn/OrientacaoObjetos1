package lista02.ex2;

public class Pessoa {
    
    String nome;
    String sexo;
    String cpf;
    int idade;
    Double altura;
    Double peso;

    public void andar() {

        System.out.println(this.nome + " está andando.");
    }
    
    public void correr() {
        
        System.out.println(this.nome + " está correndo.");
    }
    
    public void falar() {
        
        System.out.println(this.nome + " está falando.");
    }
    
    public void dormir() {
        
        System.out.println(this.nome + " está dormindo.");
    }
}
