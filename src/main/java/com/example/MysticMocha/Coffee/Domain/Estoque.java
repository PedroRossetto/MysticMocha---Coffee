package com.example.MysticMocha.Coffee.Domain;

import com.example.MysticMocha.Coffee.Domain.ENUMS.Departamentos;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "estoques")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Departamentos departamento;

    @OneToMany(mappedBy = "estoque")
    private List<EstoqueProduto> produtos;

    public Estoque() {
    }

    public Estoque(Long id, Departamentos departamento, List<EstoqueProduto> produtos) {
        this.id = id;
        this.departamento = departamento;
        this.produtos = produtos;
    }
}
