package com.example.MysticMocha.Coffee.Domain.ENUMS;

public enum Perfil {
    ADMIN("Administrador"),
    USUARIO("Usuário");

    private String descricao;

    Perfil(String descricao) {
        this.descricao = descricao;
    }


}
