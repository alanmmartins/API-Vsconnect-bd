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

@RestController //Annotation para definir controller
@RequestMapping(value = "/veiculo", produces = {"application/json"})
public class VeiculoController {

}
