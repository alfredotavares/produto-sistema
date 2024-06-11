package com.company.productsystem.service;

import com.company.productsystem.model.Produto;
import com.company.productsystem.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Serviço para gerenciar operações relacionadas aos produtos.
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Método para obter todos os produtos
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    // Método para adicionar um novo produto
    public void addProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    // Método para atualizar um produto existente
    public void updateProduto(int id, Produto produto) {
        Produto existingProduto = produtoRepository.findById(id).orElseThrow();
        existingProduto.setNome(produto.getNome());
        existingProduto.setPreco(produto.getPreco());
        existingProduto.setQuantidade(produto.getQuantidade());
        produtoRepository.save(existingProduto);
    }

    // Método para deletar um produto
    public void deleteProduto(int id) {
        produtoRepository.deleteById(id);
    }
}
