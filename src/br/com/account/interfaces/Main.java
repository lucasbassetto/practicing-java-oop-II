package br.com.account.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Nadador golfinho = new Golfinho("Flipper");
        Nadador tubarao = new Tubarao("Tubarao");
        Galinha galinha = new Galinha();

        List<Nadador> nadadores = List.of(golfinho, tubarao);

        colocarParaNadar(nadadores);
    }

    public static void colocarParaNadar(List<Nadador> nadadores) {
        System.out.println("Colocando para nadar");
        for(Nadador nadador : nadadores) {
            nadador.nadar();
        }
    }
}