package com.algaworks.pedidovenda.controller.com.algaworks.pedidovenda.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by kcleusio on 19/05/16.
 */
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String descrição;


    public Long getDi() {
        return id;
    }

    public void setDi(Long di) {
        this.id = di;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Grupo other = (Grupo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
