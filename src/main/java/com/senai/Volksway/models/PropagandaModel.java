package com.senai.Volksway.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.io.Serial;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_propaganda")
public class PropagandaModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_propaganda", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private UUID id_usuario;

    private String titulo;

    private String url;

    private String descricao;

    private Date img;
    private String publico_alvo;
    private Date data_limite;

    private float preco;
    private boolean importancia;
    private String nomeTipoPropaganda;
}