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

    public void fazerProcessoContabil() {

    }

    public void adicionarExtrato(BigDecimal valor) {

    }

    public boolean verificarSaldo() {
        return true;
    }

    public boolean verificarLogin() {
        return true;
    }

    public void subtrairValor(BigDecimal valor) {

    }

    public void imprimirComprovante() {
        System.out.println("Debito efetuado com sucesso");
    }
}
