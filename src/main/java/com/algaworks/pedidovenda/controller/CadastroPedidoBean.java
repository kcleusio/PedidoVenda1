package com.algaworks.pedidovenda.controller;

import com.algaworks.pedidovenda.model.Categoria;
import com.algaworks.pedidovenda.model.Produto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CadastroPedidoBean {

    private List<Integer> itens;

    public CadastroPedidoBean() {

        itens = new ArrayList<>();
        itens.add(1);
    }

    public List<Integer> getItens() {
        return itens;
    }



}