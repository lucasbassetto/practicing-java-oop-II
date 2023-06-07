package br.com.account.ordenacao;

import java.time.LocalDate;
import java.time.Month;
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

        // Oderna a lista com base nas letras (ordem crescente). Aqui conseguimos utilizar o Collections.sort pois nosso parâmetro
        // da lista é String, que implementa a interface Comparable.
        Collections.sort(list);

        // Imprime a lista ordenada
        System.out.println("Lista ordenada: " + list);
        System.out.println();


        // Agora, repare que em vez de uma lista de STRING, é uma lista de PESSOA

        List<Pessoa> listaPessoa = new ArrayList<>();

        Pessoa lucas = new Pessoa("Lucas", LocalDate.of(1996, Month.AUGUST, 7));
        listaPessoa.add(lucas);
        listaPessoa.add(new Pessoa("Marina", LocalDate.of(1998, Month.MAY, 6)));
        listaPessoa.add(new Pessoa("Ana", LocalDate.of(1999, Month.JANUARY, 15)));
        listaPessoa.add(new Pessoa("Beatriz", LocalDate.of(2000, Month.JANUARY, 12)));

        // Imprime a lista na ordem de inclusão dos elementos
        System.out.println(listaPessoa);

        // Oderna a lista com base nas letras (ordem alfabética)
        Collections.sort(listaPessoa);

        // Imprime a lista ordenada
        System.out.println("Lista ordenada: " + listaPessoa);
    }
}
