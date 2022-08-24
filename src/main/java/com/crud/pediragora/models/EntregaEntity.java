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
public class EntregaEntity implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_ENTREGA")                         //ID_CLIENTE_REFERENCE
	private int idEntrega;       
	
	@Column(name = "COD_ENDERECO_REFEREN")
	private int codEnderecoReferen;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "CIDADE")
	private String cidade;
	
	@Column(name = "BAIRRO")
	private String bairro;
	
	@Column(name = "RUA")
	private String rua;
	
	@Column(name = "NUMERO_CASA")
	private String numeroCasa;

	public int getIdEntrega() {
		return idEntrega;
	}

	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}

	public int getCodEnderecoReferen() {
		return codEnderecoReferen;
	}

	public void setCodEnderecoReferen(int codEnderecoReferen) {
		this.codEnderecoReferen = codEnderecoReferen;
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

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	
	
	
	

		
	
	
}
