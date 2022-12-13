package com.helloword.helloword.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWordController {
	
	@GetMapping("/mensagem")
	public String mensagem () {
		return "Olá Mercado Livre!";
	}

	@GetMapping("/bsm")
	public List<String> listaBSM() {
		
		ArrayList<String> bsm = new ArrayList<String>();
		
		bsm.add("Persitência");
		bsm.add("Responsabilidade Pessoal");
		bsm.add("Orientação ao Detalhe");
		bsm.add("Comunicação");
		
		return bsm;
		
	}
	
	@GetMapping("/list-objetivo")
	public List<String> listaObjetivoAprendizagem() {
		
		ArrayList<String> objetivoAprendizagem = new ArrayList<String>();
		
		objetivoAprendizagem.add("Spring");
		objetivoAprendizagem.add("Banco de Dados MYSQL");
		
		return objetivoAprendizagem;
		
	}
}
