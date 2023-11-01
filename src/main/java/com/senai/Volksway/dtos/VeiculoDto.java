package com.senai.Volksway.dtos;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record VeiculoDto(
        @NotBlank UUID id_usuario,
        @NotBlank String marca,

        @NotBlank String placa,

        @NotBlank String codigo_chassi) {

}
