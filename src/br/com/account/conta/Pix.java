package br.com.account.conta;

import java.math.BigDecimal;

public class Pix {

    private EnviadorDeNotificacao enviadorDeNotificacao;

    public void enviarPix(Conta conta, BigDecimal valor, String chavePix) {
        verificarChavePix(chavePix);
        conta.debito(valor);
        enviadorDeNotificacao.enviarPushNotification("Pix enviado com sucesso.");
    }

    public boolean verificarChavePix(String chavePix) {
        return true;

    }
}
