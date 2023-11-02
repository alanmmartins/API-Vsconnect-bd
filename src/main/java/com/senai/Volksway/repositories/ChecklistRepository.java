package com.senai.Volksway.repositories;

import com.senai.Volksway.models.ChecklistModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface ChecklistRepository extends JpaRepository<ChecklistModel, UUID> {


}
