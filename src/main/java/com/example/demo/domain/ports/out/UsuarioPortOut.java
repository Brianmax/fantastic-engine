package com.example.demo.domain.ports.out;

import com.example.demo.domain.model.UsuarioModel;

import java.util.Optional;

public interface UsuarioPortOut {
    UsuarioModel crearUsuarioOut(UsuarioModel usuarioModel);
    UsuarioModel buscarPorEmailOut(String email);
    Optional<UsuarioModel> buscarPorIdOut(int id);
}
