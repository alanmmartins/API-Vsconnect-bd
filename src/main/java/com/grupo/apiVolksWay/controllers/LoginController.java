package com.grupo.apiVolksWay.controllers;

import com.grupo.apiVolksWay.dtos.LoginDto;
import com.grupo.apiVolksWay.dtos.TokenDto;
import com.grupo.apiVolksWay.models.UsuarioModel;
import com.grupo.apiVolksWay.services.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired private AuthenticationManager authenticationManager;
    @Autowired private TokenService tokenService;
    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Valid LoginDto dadosLogin){
        var userNamePassword  = new UsernamePasswordAuthenticationToken(dadosLogin.email(),dadosLogin.senha());

        var auth = authenticationManager.authenticate(userNamePassword);

        var token = tokenService.gerarToken((UsuarioModel) auth.getPrincipal());

        return ResponseEntity.status(HttpStatus.OK).body(new TokenDto(token));
    }
}
