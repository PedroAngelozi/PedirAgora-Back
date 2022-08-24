package com.crud.pediragora.dto;



import javax.persistence.Column;

import com.crud.pediragora.models.PedidoEntity;

public class PedidoDTO {

	private String nomeProduto;     
	private String valorProduto;     
	
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}






	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	public String getvalorProduto() {
		return valorProduto;
	}



	public void setValorProduto(String valorProduto) {
		this.valorProduto = valorProduto;
	}






	public PedidoEntity build(PedidoDTO dto) {
		
		PedidoEntity entity = new PedidoEntity();
		
		entity.setNomeProduto(dto.getNomeProduto());
		entity.setValorProduto(dto.getvalorProduto());
		
		return entity;
	}






	private Object getValorProduto() {
		// TODO Auto-generated method stub
		return null;
	}


}
