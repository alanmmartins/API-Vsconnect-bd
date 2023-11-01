package com.senai.Volksway.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.io.Serial;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_checklist")
public class ChecklistModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_checklist", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_veiculo", referencedColumnName = "id_veiculo")
    private UUID id_veiculo;
    private boolean freio;

    private boolean combustivel;
    private boolean oleo;
    private boolean ar_condicionado;
    private String foto_pneu;
}
