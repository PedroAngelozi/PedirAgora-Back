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
import com.crud.pediragora.models.ClienteEntity;
import com.crud.pediragora.models.EnderecoEntity;
import com.crud.pediragora.service.ServiceCliente;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/cliente")
@Api(value="API REST de cadastro de cliente!")
public class ClienteResource {
	
	@Autowired
	ServiceCliente service;
	
	@ApiOperation(value="Listar todos os clientes cadastrados.") 
	@GetMapping("/listar/clientes")
	public List<ClienteEntity> listarClientess(){
	
	return service.listarTodosClientes();
	}
	
	@ApiOperation(value="Retorna um pedido cliente especifico.") // Atenção: Necessário possuir o idCliente em mãos !
	@GetMapping("/listar/{idCliente}")
	public Optional<ClienteEntity> listaClienteUnico(@PathVariable(value="idCliente") int idCliente){

		return service.BuscaClienteUnico(idCliente);

	}
	
	@ApiOperation(value="Cadastrar cliente!!!")        
	@PostMapping("/salvar/cliente")                          
	public ResponseEntity<?> salvaCliente(@RequestBody  ClienteDTO cliente) {   
		
		return service.criarCliente(cliente.buildSalvar(cliente));

	}
	
	@ApiOperation(value="Deleta um cliente especifico") // Atenção: Necessário possuir o idCliente em mãos !
	@DeleteMapping("/deletar/cliente/{idCliente}")      //          importante salientar que a exclusão é 
	                                                    //          lógica e não física.
	public ResponseEntity<Object> deletaCliente(@PathVariable(value="idCliente") int idCliente){
		
		return (ResponseEntity<Object>) service.deletarCliente(idCliente);	
	}
	
	@ApiOperation(value="Atualizar um cliente")         // Atenção: Necessário possuir o idCliente em mãos 
	@PutMapping("/cliente/atualizar")                 //         
	public void atualizarCliente(@RequestBody  ClienteDTO dto, @PathVariable(value="idCLiente") Integer idCliente)  {
		 service.atualizarCliente(dto, idCliente);

	}


	@ApiOperation(value="Listar todos os endereços cadastrados.") 
	@GetMapping("/listar/enderecos")
	public List<EnderecoEntity> listarEnderecos(){
		return service.listarTodosEnderecos();	
	}
	
	@ApiOperation(value="Retorna um endereço especifico.") // Atenção: Necessário possuir o idEndereco em mãos !
	@GetMapping("/listar/{idEndereco}")
	public Optional<EnderecoEntity> listaEnderecoUnico(@PathVariable(value="idEndereco") int idEndereco){
		return service.BuscaEnderecoUnico(idEndereco);
	}
	
	@ApiOperation(value="Cadastrar endereco!!!")        
	@PostMapping("/salvar/endereco")                          
	public ResponseEntity<?> salvaEndereco(@RequestBody  EnderecoDTO endereco) {   
		return service.criarEndereco(endereco.buildSalvar(endereco));
		
	}
	
	@ApiOperation(value="Deleta um endereco especifico") // Atenção: Necessário possuir o idEndereco em mãos !
	@DeleteMapping("/deletar/endereco/{idEndereco}")     //          importante salientar que a exclusão é 
	                                                     //          lógica e não física.
	public ResponseEntity<Object> deletaEndereco(@PathVariable(value="idEndereco") int idEndereco){
		return (ResponseEntity<Object>) service.deleteEndereco(idEndereco);
	}
			
	
	
	@ApiOperation(value="Atualizar um endereco")         // Atenção: Necessário possuir o idEndereco em mãos 
	@PutMapping("/endereco/atualizar")                            
	public void atualizaEndereco(@RequestBody  EnderecoDTO dto, @PathVariable(value="idEndereco") Integer idEndereco) {
		 service.atualizarEndereco(dto, idEndereco);	
	}


}