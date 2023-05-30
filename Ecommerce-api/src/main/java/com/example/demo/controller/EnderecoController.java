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

import com.example.demo.model.Endereco;
import com.example.demo.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereços")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecorepository;
	
	@GetMapping
	public List<Endereco> listar(){
		return enderecorepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco adicionar(@RequestBody Endereco endereco){
		return enderecorepository.save(endereco);
	}

}
