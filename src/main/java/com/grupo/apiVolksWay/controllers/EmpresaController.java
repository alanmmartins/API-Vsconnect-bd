package com.grupo.apiVolksWay.controllers;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.grupo.apiVolksWay.dtos.EmpresaDto;
import com.grupo.apiVolksWay.models.EmpresaModel;
import com.grupo.apiVolksWay.repositories.EmpresaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
@RestController

@RequestMapping(value = "/empresas" , produces ={"application/json"})
public class EmpresaController {
    @Autowired
    EmpresaRepository empresaRepository;

    @GetMapping
    public ResponseEntity<List<EmpresaModel>> listarEmpresas(){

        return ResponseEntity.status(HttpStatus.OK).body(empresaRepository.findAll());
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Object> buscarEmpresa(@PathVariable(value = "idEmpresa") UUID id){

        Optional<EmpresaModel> empresaBuscada = empresaRepository.findById(id);
        if (empresaBuscada.isEmpty()) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("empresa nao encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(empresaBuscada.get());
    }
    @PostMapping
    public ResponseEntity<Object> criarEmpresa(@RequestBody @Valid EmpresaDto empresaDto){
        
        EmpresaModel novaEmpresa = new EmpresaModel();
        BeanUtils.copyProperties(empresaDto, novaEmpresa);

        return ResponseEntity.status(HttpStatus.CREATED).body(empresaRepository.save(novaEmpresa));
    }

    @PutMapping("/{idEmpresa}")
    public ResponseEntity<Object> editarEmpresa(@PathVariable(value = "idEmpresa") UUID id, @RequestBody @Valid EmpresaDto empresaDto){

        Optional<EmpresaModel> empresaBuscada = empresaRepository.findById(id);

        if (empresaBuscada.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("empresa nao encontrado");
        }
        EmpresaModel empresaBd = empresaBuscada.get();
        BeanUtils.copyProperties(empresaDto, empresaBd);

        return  ResponseEntity.status(HttpStatus.OK).body(empresaRepository.save(empresaBd));
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity<Object> deletarempresa(@PathVariable(value = "idEmpresa") UUID id){

        Optional<EmpresaModel> empresaBuscada= empresaRepository.findById(id);
        if (empresaBuscada.isEmpty()) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("empresa nao encontrado");
        }
        empresaRepository.delete(empresaBuscada.get());
        return ResponseEntity.status(HttpStatus.OK).body("empresa deletado com sucesso!");
    }
}
