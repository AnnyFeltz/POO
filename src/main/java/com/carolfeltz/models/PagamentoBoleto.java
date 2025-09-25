package com.carolfeltz.models;

import com.carolfeltz.models.abstracts.Pagamento;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("pagando boleto ");
    }

}