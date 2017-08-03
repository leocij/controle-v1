package com.controle.v1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.controle.v1.entity.Entrada;
import com.controle.v1.representation.EntradaRepresentation;
import com.controle.v1.service.EntradaService;

@CrossOrigin
@RestController
@RequestMapping("/entradas")
public class EntradaController {
	
	@Autowired
	private EntradaService entradaService;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<List<EntradaRepresentation>> listAll(){
		List<Entrada> entradas = entradaService.findAll();	
		List<EntradaRepresentation> entradaRepresentation = new ArrayList<>();
		for(Entrada entrada : entradas) {
			entradaRepresentation.add(new EntradaRepresentation(entrada));
		}
		return ResponseEntity.ok(entradaRepresentation);
	}
}
