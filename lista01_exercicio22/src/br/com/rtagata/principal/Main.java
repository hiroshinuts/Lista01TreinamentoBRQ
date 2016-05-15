package br.com.rtagata.principal;

import br.com.rtagata.entities.Produto;
import br.com.rtagata.input.InputProduto;
import br.com.rtagata.output.OutputProduto;

public class Main {

	public static void main(String[] args) {

		Produto p = new Produto();
		InputProduto input = new InputProduto();
		OutputProduto out = new OutputProduto(); 
		
		p.setIdProduto(input.lerIdProduto());
		p.setNome(input.lerNome());
		p.setQuantidade(input.lerQuantidade());
		p.setPreco(input.lerPreco());
		
		out.imprimirDados(p);
	}

}
