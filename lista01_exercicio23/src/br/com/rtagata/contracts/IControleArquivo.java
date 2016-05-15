package br.com.rtagata.contracts;

import br.com.rtagata.entities.Produto;

public interface IControleArquivo {
	
	void abrirArquivo();
	void gravarDados(Produto p);
	void fecharArquivo();

}
