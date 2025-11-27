package com.example.demo.infrastructure.entity;

import com.example.demo.domain.model.UsuarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    private String username;
    private String nombres;
    private String apellidos;
    private String email;
    private Date fechaCreacion = new Date();
    private Date fechaActualizacion;
    private boolean estado = true;

    public UsuarioModel fromEntity() {
        return new UsuarioModel(
                this.idUsuario,
                this.username,
                this.nombres,
                this.apellidos,
                this.email,
                this.fechaCreacion,
                this.fechaActualizacion,
                this.estado
        );
    }

    public static UsuarioEntity fromDomain(UsuarioModel usuarioModel) {
        return new UsuarioEntity(
                usuarioModel.getIdUsuario(),
                usuarioModel.getUsername(),
                usuarioModel.getNombres(),
                usuarioModel.getApellidos(),
                usuarioModel.getEmail(),
                usuarioModel.getFechaCreacion(),
                usuarioModel.getFechaActualizacion(),
                usuarioModel.isEstado()
        );
    }
}
