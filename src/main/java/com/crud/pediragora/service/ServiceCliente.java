package com.crud.pediragora.service;



import java.util.Date;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crud.pediragora.dto.ClienteDTO;
import com.crud.pediragora.dto.EnderecoDTO;
import com.crud.pediragora.models.ClienteEntity;
import com.crud.pediragora.models.EnderecoEntity;
import com.crud.pediragora.repository.ClienteRepository;
import com.crud.pediragora.repository.EnderecoRepository;

@Service
public class ServiceCliente {

	@Autowired
	private ClienteRepository repository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	
	public List<ClienteEntity> listarTodosClientes() {
		return repository.findAll();

    }
	
	public List<EnderecoEntity> listarTodosEnderecos() {
		return enderecoRepository.findAll();

    }
	
	public  Optional<ClienteEntity> BuscaClienteUnico(int idCliente) {
		return repository.findById(idCliente);

	}
	
	public  Optional<EnderecoEntity> BuscaEnderecoUnico(int idEndereco) {
		return enderecoRepository.findById(idEndereco);

	}
	

   public ResponseEntity<?> criarCliente(ClienteEntity cliente) {
	
	   ClienteEntity clienteEntity = new ClienteEntity();
	   clienteEntity = cliente.build(cliente);
	   
	   repository.save(clienteEntity);
	   
	   return null;
		
	}


   public ResponseEntity<?> criarEndereco(EnderecoEntity endereco) {
	
	   EnderecoEntity enderecoEntity = new EnderecoEntity();
	   enderecoEntity = endereco.build(endereco);
	   
	   enderecoRepository.save(enderecoEntity);
	   
	   return null;
		
	}

	
   public void atualizarCliente(ClienteDTO dto, int idCliente) {
		ClienteEntity entity = repository.findById(idCliente).get();
		entity = dto.buildSalvar(dto);
		entity.setId(idCliente);
		repository.saveAndFlush(entity);
	}
   
   public void atualizarEndereco(EnderecoDTO dto, int idEndereco) {
		EnderecoEntity entity = enderecoRepository.findById(idEndereco).get();
		entity = dto.buildSalvar(dto);
		entity.setIdEndereco(idEndereco);
		repository.saveAndFlush(entity);
	}
	
   
	public ResponseEntity<?> deletarCliente(int idCliente) {
		ClienteEntity entity = repository.findById(idCliente).get();
		entity.setDataDesativacao(new Date()); 
		repository.saveAndFlush(entity);
        return ResponseEntity.ok().build();
    }
	
	public ResponseEntity<?> deleteEndereco(int idEndereco) {
		EnderecoEntity entity = enderecoRepository.findById(idEndereco).get();
		entity.setDataDesativacao(new Date()); 
		enderecoRepository.saveAndFlush(entity);
        return ResponseEntity.ok().build();
    }
}