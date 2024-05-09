package com.example.MysticMocha.Coffee.Domain;

import com.example.MysticMocha.Coffee.Domain.ENUMS.Departamentos;
import com.example.MysticMocha.Coffee.Domain.ENUMS.Perfil;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Table(name = "usuarios")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = true)
    private String nome;

    @Column(nullable = false, updatable = true, unique = true)
    private String nickname;

    @Column(nullable = false, updatable = true, unique = true)
    private String email;

    @Column(nullable = false, updatable = true)
    private String cargo;

    @Column(nullable = false, updatable = true)
    private String password;

    @Column(nullable = false, updatable = true)
    @Enumerated(EnumType.STRING)
    private Departamentos departamento;

    @Column(nullable = false, updatable = true)
    @Enumerated(EnumType.STRING)
    private Perfil perfil;

    @Column(nullable = false, updatable = true)
    private String avatar;

    public Usuario(Long id, String nome, String nickname, String email, String cargo, String password, Departamentos departamento, Perfil perfil, String avatar) {
        this.id = id;
        this.nome = nome;
        this.nickname = nickname;
        this.email = email;
        this.cargo = cargo;
        this.password = password;
        this.departamento = departamento;
        this.perfil = perfil;
        this.avatar = avatar;
    }

    public Usuario() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
