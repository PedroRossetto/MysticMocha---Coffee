package com.example.MysticMocha.Coffee.Domain.ENUMS;

public enum Departamentos {

    RH("Recursos Humanos"),
    ADMINISTRACAO("Administração"),
    FINANCEIRO("Financeiro"),
    CONTABIIL("Contábil"),
    MARKETING("Marketing"),
    VENDAS("Vendas"),
    PRODUCAO("Produção"),
    LOGISTICA("Logística"),
    TI("Tecnologia da Informação"),
    DESENVOLVIMENTO("Desenvolvimento"),
    ENGENHARIA("Engenharia"),
    ELETRICA("Elétrica"),
    MECANICA("Mecânica"),
    MANUTENCAO("Manutenção"),
    LIMPEZA("Limpeza"),
    JURIDICO("Júridico"),
    PESQUISA("Pesquisa"),
    COMPRAS("Compras"),
    SUPRIMENTOS("Suprimentos"),
    SAC("Atendimento"),
    ALMOXARIFADO("Almoxarifado"),
    FISCAL("Fiscal"),
    COMEX("Comércio Exterior");

    private String description;

    Departamentos(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
