package com.example.MysticMocha.Coffee.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chat")
@Getter
@Setter
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    private List<Mensagem> historicoMensagens = new ArrayList<>();

    @Column(nullable = false)
    private LocalDateTime dataCriacaoChat;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Usuario atendente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Usuario solicitante;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Chamado chamado;

    @Column
    private Boolean chatLidoPeloAtendente;

    @Column
    private Boolean chatLidoPeloSolicitante;

}
