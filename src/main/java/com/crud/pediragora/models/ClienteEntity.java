package com.crud.pediragora.models;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_CLIENTE")                         //ID_CLIENTE_REFERENCE
	private int idCliente;       
	
	@Column(name = "NOME_CLIENTE")
	private String nomeCliente;          
	
	@Column(name = "SOBRENOME_CLIENTE")
	private String sobrenomeCliente;     
	
	@Column(name = "NUMERO_CONTATO")
	private String numeContato;
	
	@Column(name = "DATA_DESATIVACAO")
	private Date dataDesativacao;
	
	@OneToMany(mappedBy = "cliente")
	private List<EnderecoEntity> endereco;
	
	

	public List<EnderecoEntity> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoEntity> endereco) {
		this.endereco = endereco;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

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
 
	
	public Date getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(Date dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

	public ClienteEntity build(ClienteEntity cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(int idCliente) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
		
	
	
}
