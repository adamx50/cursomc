package com.adao.cursomc.repositories;

import com.adao.cursomc.domain.Categoria;
import com.adao.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
