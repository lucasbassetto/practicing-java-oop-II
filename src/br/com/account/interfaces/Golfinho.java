package br.com.account.interfaces;

public class Golfinho implements Nadador {

    private String nome;

    public Golfinho(String nome) {
        this.nome = nome;
    }

    public Golfinho() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
