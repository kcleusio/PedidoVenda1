package com.algaworks.pedidovenda.controller;

import com.algaworks.pedidovenda.model.Categoria;
import com.algaworks.pedidovenda.model.Produto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

/**
 * Created by helderdaniel on 03/07/16.
 */

@Named
@ViewScoped
@ManagedBean(name = "cadastroProdutoBean")
public class CadastroProdutoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    private Produto produto;

    private List<Categoria> categoriasRaizes;

    public CadastroProdutoBean() {
        produto = new Produto();
    }

    public void inicializar() {
        System.out.println("Inicializando....");

        categoriasRaizes = manager.createQuery("from Categoria", Categoria.class).getResultList();

    }

    public void salvar() {

    }

    public Produto getProduto() {
        return produto;
    }

    public List<Categoria> getCategoriasRaizes() {
        return categoriasRaizes;
    }
}
