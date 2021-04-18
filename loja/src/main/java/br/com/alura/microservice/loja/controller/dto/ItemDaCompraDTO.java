package br.com.alura.microservice.loja.controller.dto;

import java.io.Serializable;

public class ItemDaCompraDTO implements Serializable {

	private static final long serialVersionUID = -6568512355272105792L;

	private long id;
	
	private int quantidade;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}