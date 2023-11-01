package com.senai.Volksway.repositories;

import org.springframework.stereotype.Repository;
import com.senai.Volksway.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository //annotation do repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
    UsuarioModel findByEmail(String email);
}
