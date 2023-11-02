package com.senai.Volksway.repositories;

import com.senai.Volksway.models.InteresseModel;
import com.senai.Volksway.models.UsuarioModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface InteresseRepository extends JpaRepository<InteresseModel, UUID> {
    InteresseModel findByEmail(String id_propaganda);
}

