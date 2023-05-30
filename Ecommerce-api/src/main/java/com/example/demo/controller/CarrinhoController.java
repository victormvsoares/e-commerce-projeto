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

import com.example.demo.model.Carrinho;
import com.example.demo.repository.CarrinhoRepository;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
	
	@Autowired
	private CarrinhoRepository carrinhorepository;
	
	@GetMapping
	public List<Carrinho> listar(){
		return carrinhorepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Carrinho adicionar(@RequestBody Carrinho carrinho){
		return carrinhorepository.save(carrinho);
	}

}
