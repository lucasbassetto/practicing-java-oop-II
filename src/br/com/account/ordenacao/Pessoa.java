package br.com.account.ordenacao;

import java.time.LocalDate;

public class Pessoa implements Comparable {

    private String nome;
    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
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
