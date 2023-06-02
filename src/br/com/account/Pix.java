package br.com.account;

import java.math.BigDecimal;

public class Pix {

    public void enviarPix(Conta conta, BigDecimal valor, String chavePix) {
        verificarChavePix(chavePix);
        conta.verificarSaldo();
        conta.subtrairValor(valor);
        conta.fazerProcessoContabil();
        conta.imprimirComprovante();
    }

    public boolean verificarChavePix(String chavePix) {
        return true;
    }
}
