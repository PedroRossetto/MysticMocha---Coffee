package com.example.MysticMocha.Coffee.Domain;

import com.example.MysticMocha.Coffee.Domain.ENUMS.Departamentos;
import com.example.MysticMocha.Coffee.Domain.ENUMS.Perfil;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Administrador extends Usuario{

    public Administrador(Long id, String nome, String nickname, String email, String cargo, String password, Departamentos departamento, String avatar) {
        super(id, nome, nickname, email, cargo, password, departamento, Perfil.ADMIN, avatar);
    }

    public Administrador() {
        super();
    }


}
