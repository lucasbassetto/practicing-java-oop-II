package br.com.account.interfaces;

public interface Nadador {

    String getNome();

    default void nadar() {
        System.out.println(getNome() + " Nadando");
    }
}
