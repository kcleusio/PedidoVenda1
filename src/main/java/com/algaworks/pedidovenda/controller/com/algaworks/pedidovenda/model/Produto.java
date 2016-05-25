package com.algaworks.pedidovenda.controller.com.algaworks.pedidovenda.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kcleusio on 19/05/16.
 */
public class Produto implements Serializable {

    private Long idProduto;
    private String nome;
    private String sku;
    private BigDecimal valorUnitario;
    private int quantidadeEstoque;
    private Categoria categoria;
    private List<Categoria> categorias=new ArrayList<>();



}
