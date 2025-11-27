package com.example.demo.domain.ports.in;

import com.example.demo.domain.model.UsuarioModel;

import java.util.Optional;

public interface UsuarioPortIn {
    UsuarioModel crearUsuarioIn(UsuarioModel usuarioModel);
    UsuarioModel buscarPorEmailIn(String email);
    Optional<UsuarioModel> buscarPorIdIn(int id);
    Optional<UsuarioModel> actualizarUsuario(int id, UsuarioModel usuarioModel);
}
