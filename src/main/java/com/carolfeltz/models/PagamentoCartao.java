package com.carolfeltz.models;

import com.carolfeltz.models.abstracts.*;

public class PagamentoCartao  extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("pagando com cartão crédito");
    }
}