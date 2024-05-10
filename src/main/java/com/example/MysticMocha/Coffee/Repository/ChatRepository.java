package com.example.MysticMocha.Coffee.Repository;

import com.example.MysticMocha.Coffee.Domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}
