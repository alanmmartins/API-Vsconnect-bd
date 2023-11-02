package com.senai.Volksway.dtos;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;
import java.util.UUID;

public record PropagandaDto(
        @NotBlank UUID id_usuario,
        @NotBlank String titulo,

        @NotBlank String descricao,

        @NotBlank String url,

        @NotBlank boolean importancia,

        @NotBlank Date data_limite,

        @NotBlank Date img,
        @NotBlank String publico_alvo,

        @NotBlank float preco,
        @NotBlank String nomeTipoPropaganda) {

}