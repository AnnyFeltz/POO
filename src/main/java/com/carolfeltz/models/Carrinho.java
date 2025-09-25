package com.carolfeltz.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;
    private Double total;
    private String descricao;
    private LocalDateTime criadoEm;
    private LocalDateTime finalizadoEm;

    public Carrinho(Double total, String descricao, LocalDateTime criadoEm, LocalDateTime finalizadoEm) {
        this.produtos = new ArrayList<>();
        this.total = total;
        this.descricao = descricao;
        this.criadoEm = criadoEm;
        this.finalizadoEm = finalizadoEm;
    }

    public Carrinho(LocalDateTime criadoEm) {
        this.produtos = new ArrayList<>();
        this.total = 0.0;
        this.descricao = "Pendente";
        this.criadoEm = criadoEm;
    }

}