package com.crud.pediragora.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.pediragora.models.ClienteEntity;
import com.crud.pediragora.models.EnderecoEntity;
import com.crud.pediragora.models.PedidoEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
	
	default Optional<ClienteEntity> findById(int idCliente) {

		return null;
	}

	void saveAndFlush(EnderecoEntity entity);
}
	

