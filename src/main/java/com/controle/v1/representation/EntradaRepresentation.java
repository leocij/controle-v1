package com.controle.v1.representation;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.hateoas.ResourceSupport;

import com.controle.v1.entity.Entrada;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class EntradaRepresentation extends ResourceSupport {

	@JsonInclude(Include.NON_NULL)
	private Long identifier;
	@JsonInclude(Include.NON_NULL)
	private Date data;
	@JsonInclude(Include.NON_NULL)
	private String descricao;
	@JsonInclude(Include.NON_NULL)
	private BigDecimal valor;

	public EntradaRepresentation() {
		super();
	}

	public EntradaRepresentation(Entrada entrada) {
		super();
		this.identifier = entrada.getId();
		this.data = entrada.getData();
		this.descricao = entrada.getDescricao();
		this.valor = entrada.getValor();
	}
	
	public static Entrada build(EntradaRepresentation entradaRepresentation) {
		Entrada entrada = new Entrada();
			entrada.setId(entradaRepresentation.getIdentifier());
			entrada.setData(entradaRepresentation.getData());
			entrada.setDescricao(entradaRepresentation.getDescricao());
			entrada.setValor(entradaRepresentation.getValor());
		return entrada;
	}

	public Long getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
