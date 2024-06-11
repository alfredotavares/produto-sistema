package com.company.productsystem.repository;

import com.company.productsystem.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório JPA para a entidade Produto.
 */
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
