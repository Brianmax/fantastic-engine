package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
