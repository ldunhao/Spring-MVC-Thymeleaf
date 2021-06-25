package com.lucas.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.lucas.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{
}
