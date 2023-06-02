package br.com.account;

import java.math.BigDecimal;

public class Conta {

    public void debito(BigDecimal valor) {
        verificarSaldo();
        verificarLogin();
        subtrairValor(valor);
        adicionarExtrato(valor);
        fazerProcessoContabil();
        imprimirComprovante();
    }

    private void fazerProcessoContabil() {

    }

    private void adicionarExtrato(BigDecimal valor) {

    }

    private boolean verificarSaldo() {
        return true;
    }

    private boolean verificarLogin() {
        return true;
    }

    private void subtrairValor(BigDecimal valor) {

    }

    private void imprimirComprovante() {
        System.out.println("Debito efetuado com sucesso");
    }
}