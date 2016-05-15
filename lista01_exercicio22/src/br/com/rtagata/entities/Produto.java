package br.com.rtagata.entities;

public class Produto {
	
	private Integer idProduto;
	private String nome;
	private Integer quantidade;
	private Double preco;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idProduto, String nome, Integer quantidade, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco
				+ "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Produto){
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
