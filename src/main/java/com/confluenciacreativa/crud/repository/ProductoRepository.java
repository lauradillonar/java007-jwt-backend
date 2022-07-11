package com.confluenciacreativa.crud.repository;

import com.confluenciacreativa.crud.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    Optional<Producto>findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
