package com.grupo.apiVolksWay.dtos;

import com.grupo.apiVolksWay.models.TipoModel;
import jakarta.validation.constraints.NotBlank;


import java.util.Date;

public record EmpresaDto (
        @NotBlank String razao_social,

        @NotBlank String cidade,

        @NotBlank String cnpj
) {
}
