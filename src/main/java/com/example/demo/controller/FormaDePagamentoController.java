package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FormaDePagamento;
import com.example.demo.repository.FormaDePagamentoRepository;

@RestController
@RequestMapping("/formadepagamento")
public class FormaDePagamentoController {
	
	@Autowired
	private FormaDePagamentoRepository formadepagamentorepository;
	
		
	@GetMapping
	public List<FormaDePagamento> listar(){
		return formadepagamentorepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FormaDePagamento adicionar(@RequestBody FormaDePagamento formadepagamento){
		return formadepagamentorepository.save(formadepagamento);
	}

}
