package com.senai.Volksway.repositories;

import com.senai.Volksway.models.EmpresaModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository //annotation do repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, UUID> {
}