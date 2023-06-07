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

        System.out.println("********** LISTA UTILIZANDO STRING **********");
        // Imprime a lista na ordem de inclusão dos elementos
        System.out.println(list);

        // Oderna a lista com base nas letras (ordem crescente). Aqui conseguimos utilizar o Collections.sort pois nosso parâmetro
        // da lista é String, que implementa a interface Comparable.
        Collections.sort(list);

        // Imprime a lista ordenada
        System.out.println("Lista ordenada: " + list);
        System.out.println();


        /* *** Agora, repare que em vez de uma lista de STRING, é uma lista de PESSOA (implementa a interface COMPARABLE) *** */

        List<Pessoa> listaPessoa = new ArrayList<>();

        Pessoa lucas = new Pessoa("Lucas", LocalDate.of(1996, Month.AUGUST, 7));
        listaPessoa.add(lucas);
        listaPessoa.add(new Pessoa("Marina", LocalDate.of(1999, Month.MAY, 6)));
        listaPessoa.add(new Pessoa("Carol", LocalDate.of(1999, Month.MAY, 6)));
        listaPessoa.add(new Pessoa("Ana", LocalDate.of(1998, Month.JANUARY, 15)));
        listaPessoa.add(new Pessoa("Beatriz", LocalDate.of(2000, Month.JANUARY, 12)));

        // Imprime a lista na ordem de inclusão dos elementos
        System.out.println(listaPessoa);

        // Oderna a lista com base nas letras (ordem alfabética), utilizando a interface COMPARABLE
        Collections.sort(listaPessoa);

        // Imprime a lista ordenada
        System.out.println("Lista ordenada utilizando COMPARABLE: " + listaPessoa);
        System.out.println();



        /* *** Utilizando a interface Comparator *** */

        List<Pessoa> listaPessoaComparator = new ArrayList<>();

        Pessoa pessoa = new Pessoa("Lucas", LocalDate.of(1996, Month.AUGUST, 7));
        listaPessoaComparator.add(lucas);
        listaPessoaComparator.add(new Pessoa("Bruna", LocalDate.of(1999, Month.MAY, 6)));
        listaPessoaComparator.add(new Pessoa("Alessandra", LocalDate.of(1999, Month.MAY, 6)));
        listaPessoaComparator.add(new Pessoa("Victor", LocalDate.of(1998, Month.JANUARY, 15)));
        listaPessoaComparator.add(new Pessoa("Silvia", LocalDate.of(2000, Month.JANUARY, 12)));

        ComparadorDePessoaPorNome comparadorDePessoaPorNome = new ComparadorDePessoaPorNome();

        // Imprime a lista na ordem de inclusão dos elementos
        System.out.println(listaPessoaComparator);

        // Ordenando a lista com a interfrace Comparator
        Collections.sort(listaPessoaComparator, comparadorDePessoaPorNome); // ou listaPessoa.sort(comparadorDePessoaPorNome);

        // Imprime a lista ordenada
        System.out.println("Lista ordenada utilizando COMPARATOR: " + listaPessoaComparator);
        System.out.println();


        List<Pessoa> listaPessoaComparator2 = new ArrayList<>();

        Pessoa pessoa2 = new Pessoa("Lucas", LocalDate.of(1996, Month.AUGUST, 7));
        listaPessoaComparator2.add(lucas);
        listaPessoaComparator2.add(new Pessoa("Bruno", LocalDate.of(1999, Month.MAY, 6)));
        listaPessoaComparator2.add(new Pessoa("Thiago", LocalDate.of(1999, Month.MAY, 6)));
        listaPessoaComparator2.add(new Pessoa("Gabriel", LocalDate.of(1998, Month.JANUARY, 15)));
        listaPessoaComparator2.add(new Pessoa("Apoca", LocalDate.of(2000, Month.JANUARY, 12)));

        // Imprime a lista na ordem de inclusão dos elementos
        System.out.println(listaPessoaComparator2);

        // Ordenando a lista com a interfrace Comparator
        listaPessoaComparator2.sort(Pessoa.COMPARADOR_POR_NOME);

        // Imprime a lista ordenada
        System.out.println(listaPessoaComparator2);
    }
}
