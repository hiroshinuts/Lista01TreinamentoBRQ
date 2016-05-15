package br.com.rtagata.entities;

/*
 * 21)	Crie uma Classe JavaBean para a entidade Produto, contendo idProduto, nome, quantidade e preco. Faça para esta Classe:
 *	•	Atributos privados
 *	•	Sobrecarga de Construtores
 *	•	Encapsulamento
 *	•	Sobrescrita dos métodos equals, hashCode e toString
 */

public class Produto {

	// Atributos Privados
	private Integer idProduto;
	private String nome;
	private Integer quantidade;
	private Double preco;

	// Construtor vazio
	public Produto() {
		// vazio
	}

	// Sobrecarga de Construtor
	public Produto(Integer idProduto, String nome, Integer quantidade, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	// Encapsulamento Getters and Setters
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

	// Sobrescrita do metodo toString
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco
				+ "]";
	}

	// Sobrescrita do metodo equals
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Produto) {

			Produto p = (Produto) obj;

			return p.getIdProduto().equals(idProduto);
		}
		return false;
	}

	// Sobrescrita do metodo hashCode
	@Override
	public int hashCode() {
		return idProduto.hashCode();
	}

}
