package com.senai.Volksway.dtos;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record VeiculoDto(
        @NotBlank String placa,

        @NotBlank String marca,
        @NotBlank UUID id_usuario,


        @NotBlank UUID chassi
       ) {

}
