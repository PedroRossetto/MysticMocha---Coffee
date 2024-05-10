package com.example.MysticMocha.Coffee.Repository;

import com.example.MysticMocha.Coffee.Domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
