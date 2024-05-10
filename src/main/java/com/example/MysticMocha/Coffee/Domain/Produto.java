package com.example.MysticMocha.Coffee.Domain;

import com.example.MysticMocha.Coffee.Domain.ENUMS.Departamentos;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "produtos")
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = true)
    private String descricao;

    @OneToMany(mappedBy = "produto")
    private List<EstoqueProduto> estoques;

    @Column(nullable = false, updatable = true)
    private String codigo;

    public Produto() {
    }

    public Produto(Long id, String descricao, String codigo) {
        this.id = id;
        this.descricao = descricao;
        this.codigo = codigo;
    }
}
