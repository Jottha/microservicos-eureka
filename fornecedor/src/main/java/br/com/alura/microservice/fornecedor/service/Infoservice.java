package br.com.alura.microservice.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.repository.InforRepository;

@Service
public class Infoservice {
	
	@Autowired
	private InforRepository inforRepository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		return inforRepository.findByEstado(estado);
	}
}