package com.example.MysticMocha.Coffee.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "estoque_produto")
public class EstoqueProduto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "estoque_id", nullable = false)
        private Estoque estoque;

        @ManyToOne
        @JoinColumn(name = "produto_id", nullable = false)
        private Produto produto;

        @Column(nullable = false)
        private Integer quantidade;

        @Column(nullable = true, updatable = true)
        private BigDecimal valorUnitario;

        @Column(nullable = false, updatable = true)
        private Integer estoqueMin;

        public EstoqueProduto() {
        }

        public EstoqueProduto(Long id, Estoque estoque, Produto produto, Integer quantidade, BigDecimal valorUnitario, Integer estoqueMin) {
                this.id = id;
                this.estoque = estoque;
                this.produto = produto;
                this.quantidade = quantidade;
                this.valorUnitario = valorUnitario;
                this.estoqueMin = estoqueMin;
        }


}
