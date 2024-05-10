package com.example.MysticMocha.Coffee.Repository;

import com.example.MysticMocha.Coffee.Domain.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
