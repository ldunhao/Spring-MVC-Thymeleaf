package com.lucas.curso.boot.dao;

import com.lucas.curso.boot.domain.Cargo;

import java.util.List;

public interface CargoDao {
    void save(Cargo departamento);

    void update(Cargo departamento);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
