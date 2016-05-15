package br.com.rtagata.principal;

import br.com.rtagata.entities.Produto;
import br.com.rtagata.factory.FactoryArquivo;
import br.com.rtagata.input.InputProduto;
import br.com.rtagata.types.TipoArquivo;

public class Main {

	public static void main(String[] args) {

		Produto p = new Produto();
		InputProduto inp = new InputProduto();

		p.setIdProduto(inp.lerIdProduto());
		p.setNome(inp.lerNome());
		p.setQuantidade(inp.lerQuantidade());
		p.setPreco(inp.lerPreco());

		System.out.println(inp);

		FactoryArquivo factory = new FactoryArquivo(TipoArquivo.XML);
		factory.gerarArquivo(p);

		FactoryArquivo factory2 = new FactoryArquivo(TipoArquivo.TXT);
		factory2.gerarArquivo(p);

	}

}
