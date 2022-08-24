package com.crud.pediragora.resources;

import java.util.Date;



import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.pediragora.dto.ClienteDTO;
import com.crud.pediragora.dto.EnderecoDTO;
import com.crud.pediragora.dto.PedidoDTO;
import com.crud.pediragora.models.ClienteEntity;
import com.crud.pediragora.models.EnderecoEntity;
import com.crud.pediragora.models.PedidoEntity;
import com.crud.pediragora.repository.ClienteRepository;
import com.crud.pediragora.repository.EnderecoRepository;
import com.crud.pediragora.repository.PedidoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/pedido")
@Api(value="API REST responsavel por fazer os pedidos.")
public class PedidoResource {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	@ApiOperation(value="Lista todos os pedidos.") 
	@GetMapping("/listar/pedidos")
	public List<PedidoEntity> listarPedidos(){
		return pedidoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um pedido especifico")
	@GetMapping("/listar/{idPedido}")
	public Optional<PedidoEntity> listaPedidoUnico(@PathVariable(value="idPedido") Integer idPedido){
		return pedidoRepository.findById(idPedido);
	}
	
	@ApiOperation(value="Fazer um pedido")     
	@PostMapping("/salvar/pedido")
	public void salvaPedido(@RequestBody  PedidoDTO pedido,  ClienteDTO cliente, EnderecoDTO endereco) {
		ClienteEntity clienteEntity = new ClienteEntity();
		EnderecoEntity enderecoEntity = new EnderecoEntity();
		PedidoEntity pedidoEntity = new PedidoEntity();
		
		pedidoEntity = pedido.build(pedido);
		clienteEntity = cliente.build(cliente);
		enderecoEntity = endereco.build(endereco);
		
		enderecoRepository.save(enderecoEntity);
		clienteRepository.save(clienteEntity);
	    pedidoRepository.save(pedidoEntity);
	    System.out.println("Salvo!");
	}
	
	@ApiOperation(value="Deleta um pedido")
	@DeleteMapping("/deletar/pedido/{idPedido}")
	public ResponseEntity<Object> deletaPedido(@PathVariable(value="idPedido") Integer idPedido){
		
		PedidoEntity entity = pedidoRepository.findById(idPedido).get();
		pedidoRepository.saveAndFlush(entity);
        return ResponseEntity.ok().build();
		
	}
	
	@ApiOperation(value="Atualiza um pedido")
	@PutMapping("/pedido/atualizar")
	public PedidoEntity atualizaPedido(@RequestBody  PedidoEntity pedido) {
		return pedidoRepository.save(pedido);
	}

	

}