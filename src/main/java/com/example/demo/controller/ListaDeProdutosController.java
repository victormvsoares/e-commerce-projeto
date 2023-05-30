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

import com.example.demo.model.ListaDeProdutos;
import com.example.demo.repository.ListaDeProdutosRepository;

@RestController
@RequestMapping("/listadeprodutos")
public class ListaDeProdutosController {
	
	@Autowired
	private ListaDeProdutosRepository listadeprodutosrepository;
	
	@GetMapping
	public List<ListaDeProdutos> listar(){
		return listadeprodutosrepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ListaDeProdutos adicionar(@RequestBody ListaDeProdutos listadeprodutos){
		return listadeprodutosrepository.save(listadeprodutos);
	}

}
