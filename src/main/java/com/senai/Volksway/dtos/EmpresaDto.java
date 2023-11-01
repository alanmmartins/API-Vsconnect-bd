package com.senai.Volksway.dtos;

import jakarta.validation.constraints.NotBlank;

public record EmpresaDto(
        @NotBlank String razao_social,
        @NotBlank String cidade,
        @NotBlank String cnpj) {

}
