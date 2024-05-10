package com.example.MysticMocha.Coffee.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "chamados")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 300)
    private String titulo;
    @Column(nullable = false, length = 1000)
    private String descricao;
    @Column(nullable = false, length = 300)
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Usuario solicitante;

    @Column(nullable = false, length = 300)
    private String categoria;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Usuario atendente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Chat chat;

    @Column(nullable = false, length = 50)
    private String prioridade;
    @Column(nullable = false, length = 300)
    private LocalDateTime data_abertura;

    @Column
    private LocalDateTime data_fechamento;
}
