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

@RestController //Annotation para definir controller
@RequestMapping(value = "/checklist", produces = {"application/json"})
public class ChecklistController {
    @Autowired //Injeção de dependência (deixar o código desacoplado, classe que utiliza funcionalidades de outras classes)
    ChecklistRepository checklistRepository;
 // Essa anotação é uma das várias anotações do Spring que ajudam a mapear solicitações HTTP para métodos em controladores, facilitando o desenvolvimento de aplicativos da web. Além do "@PostMapping", existem outras anotações, como "@GetMapping", "@PutMapping" e "@DeleteMapping", que são usadas para mapear solicitações HTTP GET, PUT e DELETE, respectivamente.
    @PostMapping
    public ResponseEntity<Object> preencherChecklist(@RequestBody @Valid ChecklistDto checklistDto){
        ChecklistModel novoChecklist = new ChecklistModel();
        BeanUtils.copyProperties(checklistDto, novoChecklist);

        return ResponseEntity.status(HttpStatus.CREATED).body(checklistRepository.save(novoChecklist));
    }
}
