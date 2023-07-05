package br.com.account.interfaces;

public class Tubarao implements Nadador {

    private String nome;

    public Tubarao() {
    }

    public Tubarao(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando rápido");
    }
}
