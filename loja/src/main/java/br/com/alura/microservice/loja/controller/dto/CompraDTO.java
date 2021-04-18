package br.com.alura.microservice.loja.controller.dto;

import java.io.Serializable;
import java.util.List;

public class CompraDTO implements Serializable {

	private static final long serialVersionUID = 130581744761194387L;

	private List<ItemDaCompraDTO> itens;
	
	private EnderecoDTO endereco;

	public List<ItemDaCompraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCompraDTO> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
}