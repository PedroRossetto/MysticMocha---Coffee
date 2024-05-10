package com.example.MysticMocha.Coffee.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensagem")
@Getter
@Setter
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(length = 600)
    private String texto;

    @Column(nullable = true)
    private String urlLink;

    @Column(nullable = false)
    private LocalDateTime datahora;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Chat chat;

    @ManyToOne(cascade = CascadeType.ALL)
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