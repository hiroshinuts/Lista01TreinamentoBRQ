package br.com.rtagata.controls;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.rtagata.contracts.IControleArquivo;
import br.com.rtagata.entities.Produto;

public class ControleArquivoTxt implements IControleArquivo {

	private FileWriter arquivo;

	@Override
	public void abrirArquivo() {

		try {
			arquivo = new FileWriter(new File("c:\\temp\\produto.txt"), true);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void gravarDados(Produto p) {

		try {
			arquivo.write("\r\nProduto:");
			arquivo.write("\r\nId do Produto..........: " + p.getIdProduto());
			arquivo.write("\r\nNome...................:" + p.getNome());
			arquivo.write("\r\nQuantidade.............:" + p.getQuantidade());
			arquivo.write("\r\nPreço..................:" + p.getPreco());
			arquivo.write("\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void fecharArquivo() {

		try {
			arquivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
