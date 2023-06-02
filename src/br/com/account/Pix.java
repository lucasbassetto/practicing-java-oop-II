package br.com.account;

import java.math.BigDecimal;

public class Pix {

    public void enviarPix(Conta conta, BigDecimal valor, String chavePix) {
        verificarChavePix(chavePix);
        conta.debito(valor);
    }

    public boolean verificarChavePix(String chavePix) {
        return true;
    }
}
