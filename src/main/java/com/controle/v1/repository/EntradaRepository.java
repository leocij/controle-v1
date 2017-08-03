package com.controle.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.v1.entity.Entrada;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, Long> {

}
