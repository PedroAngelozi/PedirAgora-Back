package com.crud.pediragora.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.pediragora.models.PedidoEntity;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Integer> {
	@Override
	default Optional<PedidoEntity> findById(Integer idPedido) {

		return null;
	} 
	
	

}

