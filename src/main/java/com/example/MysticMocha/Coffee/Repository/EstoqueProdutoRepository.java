package com.example.MysticMocha.Coffee.Repository;

import com.example.MysticMocha.Coffee.Domain.EstoqueProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueProdutoRepository extends JpaRepository<EstoqueProduto, Long> {
}
