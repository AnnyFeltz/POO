package com.efigenioluiz.models;

import com.efigenioluiz.models.abstracts.*;

public class PagamentoCartao  extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("pagando com cartão crédito");
    }
}
