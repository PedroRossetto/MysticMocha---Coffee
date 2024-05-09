package com.example.MysticMocha.Coffee.Domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensagem")
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(length = 600)
    private String texto;

    @Column
    private String urlLink;

    @Column
    private LocalDateTime datahora;

    @ManyToOne
    @JoinColumn
    private Chat chat;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario remetente;


    public Mensagem() {
    }

    public Mensagem(Long id, String urlLink, Chat chat, Usuario remetente, LocalDateTime datahora) {
        this.id = id;
        this.urlLink = urlLink;
        this.chat = chat;
        this.remetente = remetente;
        this.datahora = datahora;
    }
}