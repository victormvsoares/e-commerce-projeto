package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ListaDeProdutos;

@Repository
public interface ListaDeProdutosRepository extends JpaRepository<ListaDeProdutos, Long> {

}
