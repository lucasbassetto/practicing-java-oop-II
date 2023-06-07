package br.com.account.ordenacao;

import java.time.LocalDate;
import java.util.Comparator;

public class Pessoa implements Comparable {

    public static final Comparator<Pessoa> COMPARADOR_POR_NOME = Comparator.comparing(Pessoa::getNome);


    private String nome;
    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public int compareTo(Object objetoAComparar) {
        if(!(objetoAComparar instanceof Pessoa)) {
            throw new IllegalArgumentException("Somente é possível comparar pessoas com outra pessoa");
        }

        Pessoa pessoaAComparar = (Pessoa) objetoAComparar; //DOWNCASTING

        return this.nome.compareTo(pessoaAComparar.nome);
    }

    @Override
    public String toString() {
        return  nome;
//                + " - "
//                + "Data de nascimento: "
//                + dataDeNascimento;

    }
}
