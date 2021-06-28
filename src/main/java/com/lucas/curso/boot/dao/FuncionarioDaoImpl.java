package com.lucas.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.lucas.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
