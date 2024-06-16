package com.Literatura.ErickLiteratura.repository;

import com.Literatura.ErickLiteratura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Optional<Libro> findByTitulo(String titulo);
}
