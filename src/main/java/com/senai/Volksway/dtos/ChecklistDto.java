package com.senai.Volksway.dtos;

import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public record ChecklistDto(
        @NotBlank UUID id_veiculo,
        @NotBlank boolean freio,

        @NotBlank boolean combustivel,
        @NotBlank boolean oleo,
        @NotBlank boolean ar_condicionado,
        MultipartFile imagem) {

}