package com.example.demo.infrastructure.controller;

import com.example.demo.domain.model.UsuarioModel;
import com.example.demo.domain.ports.in.UsuarioPortIn;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.nio.file.OpenOption;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    private final UsuarioPortIn usuarioPortIn;

    public UsuarioController(UsuarioPortIn usuarioPortIn) {
        this.usuarioPortIn = usuarioPortIn;
    }

    @PostMapping("/crear")
    public UsuarioModel crearUsuario(@RequestBody UsuarioModel usuarioModel) {
        return usuarioPortIn.crearUsuarioIn(usuarioModel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioModel> buscarPorId(@PathVariable int id) {
        Optional<UsuarioModel> usuarioModelOptional = usuarioPortIn.buscarPorIdIn(id);
        if(usuarioModelOptional.isPresent()) {
            return ResponseEntity.status(200).body(usuarioModelOptional.get());
        }
        return ResponseEntity.notFound().build();
    }
}
