package com.senai.Volksway.controllers;

import com.senai.Volksway.dtos.UsuarioDto;
import com.senai.Volksway.models.UsuarioModel;
import com.senai.Volksway.repositories.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController //Annotation para definir controller
@RequestMapping(value = "/interesse", produces = {"application/json"})
public class InteresseController {
}
