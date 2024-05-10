package com.example.MysticMocha.Coffee.Repository;

import com.example.MysticMocha.Coffee.Domain.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}
