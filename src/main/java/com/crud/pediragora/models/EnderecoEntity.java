package com.crud.pediragora.models;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_ENDERECO")
public class EnderecoEntity implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_ENDERECO")              //ID_ENDERECO_RESIDENCIA_REFERENCE
	private int idEndereco;       
	
	@Column(name = "PAIS")
	private String pais;          
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "CIDADE")
	private String cidade;          
	
	@Column(name = "BAIRRO")
	private String bairro;          
	
	@Column(name = "RUA")
	private String rua;          
	
	@Column(name = "NUMERO_CASA")
	private String numeCasa;
	
	@Column(name = "CEP")
	private String cep;          
	
	@Column(name = "DATA_DESATIVACAO")
	private Date dataDesativacao;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE_REFERENCE", nullable = true)
	private ClienteEntity cliente;
	
	
	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

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

	public Date getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(Date dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

	public EnderecoEntity build(EnderecoEntity endereco) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
		
	
	
}
