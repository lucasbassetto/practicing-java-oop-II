package br.com.account;

import java.math.BigDecimal;

public class InternetBanking {

    public void fazerTED(Conta conta, BigDecimal valor) {
        conta.verificarSaldo();
        conta.subtrairValor(valor);
        conta.fazerProcessoContabil();
        conta.imprimirComprovante();
    }

}
