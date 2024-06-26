package com.company.productsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entidade Produto que representa um produto no sistema.
 */
@Entity
public class Produto {

    @Id
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
