package lista4.ex4;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    
    private String nome;
    private int idade;
    private String sexo;
    private Dono dono;
    private List<Tratamento> tratamentos;

    public Animal(String nome, int idade, String sexo, Dono dono) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dono = dono;
        this.tratamentos = new ArrayList<>();
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public String getSexo() {

        return sexo;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }

    public Dono getDono() {

        return dono;
    }

    public void setDono(Dono dono) {

        this.dono = dono;
    }

    public List<Tratamento> getTratamentos() {

        return tratamentos;
    }

    public void addTratamento(Tratamento tratamento) {

        this.tratamentos.add(tratamento);
    }

    @Override
    public String toString() {

        return "Animal: " + nome + ", Idade: " + idade + ", Sexo: " + sexo + ", Dono: " + dono;
    }
}
