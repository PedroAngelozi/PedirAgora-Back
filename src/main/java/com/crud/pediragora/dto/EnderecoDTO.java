package com.crud.pediragora.dto;



import java.util.Date;

import javax.persistence.Column;

import com.crud.pediragora.models.ClienteEntity;
import com.crud.pediragora.models.EnderecoEntity;
import com.crud.pediragora.models.PedidoEntity;

public class EnderecoDTO {
	
	private String pais;          
	private String estado;
	private String cidade;          
	private String bairro;          
	private String rua;          
	private String numeCasa;
	private String cep;
	private Date dataDesativacao;
	
	



	public String getPais() {
		return pais;
	}





	public void setPais(String pais) {
		this.pais = pais;
	}





	public String getEstado() {
		return estado;
	}





	public void setEstado(String estado) {
		this.estado = estado;
	}





	public String getCidade() {
		return cidade;
	}





	public void setCidade(String cidade) {
		this.cidade = cidade;
	}





	public String getBairro() {
		return bairro;
	}





	public void setBairro(String bairro) {
		this.bairro = bairro;
	}





	public String getRua() {
		return rua;
	}





	public void setRua(String rua) {
		this.rua = rua;
	}





	public String getNumeCasa() {
		return numeCasa;
	}





	public void setNumeCasa(String numeCasa) {
		this.numeCasa = numeCasa;
	}





	public String getCep() {
		return cep;
	}





	public void setCep(String cep) {
		this.cep = cep;
	}






	public EnderecoEntity build(EnderecoDTO dto) {
		
		EnderecoEntity entity = new EnderecoEntity();
		
		entity.setPais(dto.getPais());
		entity.setEstado(dto.getEstado());
		entity.setCidade(dto.getCidade());
		entity.setBairro(dto.getBairro());
		entity.setRua(dto.getRua());
		entity.setNumeCasa(dto.getNumeCasa());	
		entity.setCep(dto.getCep());
		
		return entity;
	}





	public EnderecoEntity buildSalvar(EnderecoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}






}
