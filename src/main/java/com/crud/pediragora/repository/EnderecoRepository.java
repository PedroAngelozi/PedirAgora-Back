package com.crud.pediragora.repository;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.pediragora.models.EnderecoEntity;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Integer> {
	
	default Optional<EnderecoEntity> findById(int idEndereco) {

		return null;
	}
	
}

