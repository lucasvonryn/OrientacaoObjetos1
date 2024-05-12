package aula12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTeste {

    public static void main(String[] args) {
          
        List<String> listaGenerica = new ArrayList<String>();

        listaGenerica.add("Lucas Von Ryn");
        listaGenerica.add("Milena Ferreira");
        listaGenerica.add("Oliveira");
        listaGenerica.add("Tadeu");
        
        for (String nome : listaGenerica) {
        	
        	System.out.println("Nome: " + nome);
        }
    }
}