package com.senai.apiVolksWay.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record UsuarioDto(
        @NotBlank String nome,

        @NotBlank @Email(message = "o email deve estar no formato valodo")String email,

        String telefone,

        String empresa,
        String cep,

        LocalDate dataDeNasc,

        String senha

        )
{
}
