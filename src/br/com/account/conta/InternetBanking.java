package br.com.account.conta;

import java.math.BigDecimal;

public class InternetBanking {

    public void fazerTED(Conta conta, BigDecimal valor) {
        conta.debito(valor);
    }
}
