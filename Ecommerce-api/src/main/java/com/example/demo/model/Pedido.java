package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "id")
	private Carrinho carrinho;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "id")
	private FormaDePagamento formadepagamento;

}
