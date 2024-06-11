package com.company.productsystem.controller;

import com.company.productsystem.model.Produto;
import com.company.productsystem.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gerenciar produtos.
 */
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // Endpoint para obter todos os produtos
    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    // Endpoint para adicionar um novo produto
    @PostMapping
    public void addProduto(@RequestBody Produto produto) {
        produtoService.addProduto(produto);
    }

    // Endpoint para atualizar um produto existente
    @PutMapping("/{id}")
    public void updateProduto(@PathVariable int id, @RequestBody Produto produto) {
        produtoService.updateProduto(id, produto);
    }

    // Endpoint para deletar um produto existente
    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable int id) {
        produtoService.deleteProduto(id);
    }
}
