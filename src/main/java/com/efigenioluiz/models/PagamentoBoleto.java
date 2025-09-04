package com.efigenioluiz.models;

import com.efigenioluiz.models.abstracts.Pagamento;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("pagando boleto ");
    }

}
