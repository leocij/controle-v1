package com.controle.v1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.controle.v1.entity.Entrada;
import com.controle.v1.repository.EntradaRepository;

@Service
public class EntradaService {
	
	@Autowired
	private EntradaRepository entradaRepository;
	
	@Transactional(readOnly = true)
	public List<Entrada> findAll(){
		return entradaRepository.findAll();
	}
}
