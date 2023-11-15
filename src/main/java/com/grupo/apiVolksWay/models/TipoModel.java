package com.grupo.apiVolksWay.models;

public enum TipoModel {
    ADMIN("admin"),
    MOTORISTA("motorista"),
    PROPRIETARIO("proprietario"),
    ADMFROTA("admfrota");

    private  String tipo;
    TipoModel(String tipoRecebido){
        this.tipo = tipoRecebido;

    }
    public String getRole(){
        return tipo;
    }
}
