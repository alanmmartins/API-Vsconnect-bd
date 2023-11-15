package com.grupo.apiVolksWay.dtos;

import com.grupo.apiVolksWay.models.TipoModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record UsuarioDto(


        @NotBlank String nome,

        @NotBlank String telefone,

        @NotBlank @Email(message = "O email deve estar no formato válido") String email,

        @NotBlank String senha,

        Date data_nascimento,
        String cidade,
        String cpf,

        TipoModel tipo_usuario,

        MultipartFile imagem


) {
}