package com.example.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {
    private int idUsuario;
    private String username;
    private String nombres;
    private String apellidos;
    private String email;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private boolean estado;
}
