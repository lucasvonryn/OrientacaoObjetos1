package aula12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTeste {

    public static void main(String[] args) {
          
        List listaGenerica = new ArrayList();

        listaGenerica.add("Lucas Von Ryn");
        listaGenerica.add("Milena Ferreira");

        for(int i = 0; i < listaGenerica.size(); i++) {

            System.out.println(listaGenerica.get(i));
        }
    }
}
