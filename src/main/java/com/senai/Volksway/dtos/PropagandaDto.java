package com.senai.Volksway.dtos;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;
import java.util.UUID;

public record PropagandaDto(
        @NotBlank UUID id_usuario,
        @NotBlank String titulo,

        @NotBlank String url,

        @NotBlank String descricao,

        @NotBlank Date img,
        @NotBlank String publico_alvo,
        @NotBlank Date data_limite,

        @NotBlank float preco,
        @NotBlank boolean importancia,
        @NotBlank String nomeTipoPropaganda) {

}