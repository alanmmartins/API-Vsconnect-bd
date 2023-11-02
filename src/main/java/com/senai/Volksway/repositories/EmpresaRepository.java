package com.senai.Volksway.repositories;

import com.senai.Volksway.dtos.EmpresaDto;
import com.senai.Volksway.models.EmpresaModel;
import com.senai.Volksway.models.UsuarioModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, UUID> {

    EmpresaModel findByEmail(String cnpj);
}