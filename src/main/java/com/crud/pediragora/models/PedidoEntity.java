package com.crud.pediragora.models;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PEDIDO")
public class PedidoEntity implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_PEDIDO")
	private int idPedido;       
	
	@Column(name = "COD_CLIENTE_REFEREN")
	private int codClienteReferen;          
	
	@Column(name = "COD_PRODUTO_REFEREN")
	private int codProdutoReferen;     
	
	@Column(name = "NOME_PRODUTO")
	private String nomeProduto;     
	
	@Column(name = "VALOR_TOTAL")
	private String valorProduto;     
	
	@Column(name = "COD_ENDERECO_REFEREN")
	private int codEnderecoReferen;

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getCodClienteReferen() {
		return codClienteReferen;
	}

	public void setCodClienteReferen(int codClienteReferen) {
		this.codClienteReferen = codClienteReferen;
	}

	public int getCodProdutoReferen() {
		return codProdutoReferen;
	}

	public void setCodProdutoReferen(int codProdutoReferen) {
		this.codProdutoReferen = codProdutoReferen;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(String valorProduto) {
		this.valorProduto = valorProduto;
	}

	public int getCodEnderecoReferen() {
		return codEnderecoReferen;
	}

	public void setCodEnderecoReferen(int codEnderecoReferen) {
		this.codEnderecoReferen = codEnderecoReferen;
	}


	
	
	
		
	
	
}
