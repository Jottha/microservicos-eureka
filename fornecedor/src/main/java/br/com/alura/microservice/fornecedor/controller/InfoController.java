package br.com.alura.microservice.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.service.Infoservice;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private Infoservice infoservice;
	
	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoservice.getInfoPorEstado(estado);
	}
}
