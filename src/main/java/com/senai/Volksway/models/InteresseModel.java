package com.senai.Volksway.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.io.Serial;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_interesse")
public class InteresseModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_interesse", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_propaganda", referencedColumnName = "id_usuario")
    private UUID id_propaganda;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private UUID id_usuario;

    private boolean meio_contato_email;
}
