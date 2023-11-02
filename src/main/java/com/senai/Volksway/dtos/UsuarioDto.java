package com.senai.Volksway.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;
import java.util.UUID;

public record UsuarioDto(
        @NotBlank UUID id_empresa,
        @NotBlank String nome,

        @NotBlank String cpf,
        @NotBlank String senha,
        @NotBlank @Email(message = "O email deve estar no formato válido") String email,


        @NotBlank String telefone,

        @NotBlank String cidade,
        @NotBlank Date data_nascimento,

        @NotBlank int tipo_usuario) {

}

