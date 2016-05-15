package br.com.rtagata.output;

import br.com.rtagata.entities.Produto;

public class OutputProduto {
	
	public void imprimirDados(Produto p){
		
		
		System.out.println("Id do Produto..............:" + p.getIdProduto());
		System.out.println("Nome do Produto............:" + p.getNome());
		System.out.println("Preco......................:" + p.getPreco());
		System.out.println("Quantidade.................:" + p.getQuantidade());
		
	}

}
