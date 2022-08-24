package com.crud.pediragora.dto;



import javax.persistence.Column;

import com.crud.pediragora.models.ClienteEntity;
import com.crud.pediragora.models.PedidoEntity;

public class ClienteDTO {
	
	private String nomeCliente;          	
	private String sobrenomeCliente;     
	private String numeContato;
	
	


	public String getNomeCliente() {
		return nomeCliente;
	}




	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}




	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}




	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}




	public String getNumeContato() {
		return numeContato;
	}




	public void setNumeContato(String numeContato) {
		this.numeContato = numeContato;
	}






	



	public ClienteEntity build(ClienteDTO dto) {
		
		ClienteEntity entity = new ClienteEntity();
		
		entity.setNomeCliente(dto.getNomeCliente());
		entity.setSobrenomeCliente(dto.getSobrenomeCliente());
		entity.setNumeContato(dto.getNumeContato());
		
		return entity;
	}




	public ClienteEntity buildSalvar(ClienteDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}


}
