package com.crud.biblioteca.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Usuarios,Long> {
        Optional<Usuarios> findByName(String name);
}
