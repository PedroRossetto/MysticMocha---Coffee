package com.example.MysticMocha.Coffee.Repository;

import com.example.MysticMocha.Coffee.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByNickname(String nickname);
}
