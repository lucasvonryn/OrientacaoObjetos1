package aula12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTeste {

    public static void main(String[] args) {
    	
    	Carro carro1 = new Carro("408", "Ferrari", 2016);
          
        List listaGenerica = new ArrayList();

        listaGenerica.add("Lucas Von Ryn");
        listaGenerica.add("Milena Ferreira");
        listaGenerica.add(carro1);

        String nome1 = (String) listaGenerica.get(0);
        String nome2 = (String) listaGenerica.get(1);
        Carro objetoCarro = (Carro) listaGenerica.get(2);
    }
}
