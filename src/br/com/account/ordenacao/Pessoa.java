package br.com.account.ordenacao;

import java.time.LocalDate;
import java.util.Comparator;

public class Pessoa implements Comparable {

    public static final Comparator<Pessoa> COMPARADOR_POR_NOME = Comparator.comparing(Pessoa::getNome);

    public static final Comparator<Pessoa> COMPARADOR_POR_NOME_LAMBDA = Comparator.comparing((x) -> x.getNome()); // mesma função de cima, apenas escrita de maneira diferente

    public static final Comparator<Pessoa> COMPARADOR_POR_IDADE_E_NOME = Comparator
            .comparing(Pessoa::getDataDeNascimento).reversed()
            .thenComparing(Pessoa::getNome);

    private String nome;
    private LocalDate dataDeNascimento;
    private String cpf;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
