package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helded on 23/04/16.
 */



public class CadastroLogradouroBean {

    private List<Integer> itens;

    public CadastroLogradouroBean() {
        itens = new ArrayList<>();
        itens.add(1);
    }

    public List<Integer> getItens() {
        return itens;
    }
}
