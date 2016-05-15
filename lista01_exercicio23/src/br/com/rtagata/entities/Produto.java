package br.com.rtagata.entities;

public class Produto {

	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idProduto, String nome, Double preco, Integer quantidade) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Produto){
			Produto p = (Produto) obj;
			return p.idProduto.equals(idProduto);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return idProduto.hashCode();
	}
	
}
