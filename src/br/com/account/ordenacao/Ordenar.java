package br.com.account.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenar {

    public static void main(String[] args) {


        // O exercício proposto era receber uma lista com alguns elementos e ordená-los em ordem crescente.

        List<String> list = new ArrayList<>();

        list.add("Lucas");
        list.add("Marina");
        list.add("Ana");
        list.add("Beatriz");

        // Imprime a lista na ordem de inclusão dos elementos
        System.out.println(list);

        // Oderna a lista com base nas letras (ordem crescente)
        Collections.sort(list);

        // Imprime a lista ordenada
        System.out.println("Lista ordenada: " + list);


    }
}
