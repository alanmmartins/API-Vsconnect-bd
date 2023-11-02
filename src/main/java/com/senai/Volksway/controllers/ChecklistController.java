package com.senai.Volksway.controllers;

import com.senai.Volksway.dtos.ChecklistDto;
import com.senai.Volksway.models.ChecklistModel;
import com.senai.Volksway.repositories.ChecklistRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/checklist", produces = {"application/json"})
public class ChecklistController {
    @Autowired
    ChecklistRepository checklistRepository;

    @PostMapping
    public ResponseEntity<Object> preencherChecklist(@RequestBody @Valid ChecklistDto checklistDto){
        ChecklistModel novoChecklist = new ChecklistModel();
        BeanUtils.copyProperties(checklistDto, novoChecklist);

        return ResponseEntity.status(HttpStatus.CREATED).body(checklistRepository.save(novoChecklist));
    }
}
