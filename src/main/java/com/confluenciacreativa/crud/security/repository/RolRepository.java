package com.confluenciacreativa.crud.security.repository;

import com.confluenciacreativa.crud.security.entity.Rol;
import com.confluenciacreativa.crud.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
