package br.com.rtagata.controls;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.rtagata.contracts.IControleArquivo;
import br.com.rtagata.entities.Produto;

public class ControleArquivoXml implements IControleArquivo {

	private FileWriter arquivo;

	@Override
	public void abrirArquivo() {

		try {
			arquivo = new FileWriter(new File("c:\\temp\\produto.xml"), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void gravarDados(Produto p) {

		try {
			arquivo.write("<?xml version='1.0' encoding='iso-8859-1'?>");
			arquivo.write("<produto>");
			arquivo.write("<idfuncionario>" + p.getIdProduto() + "</idfuncionario>");
			arquivo.write("<nome>" + p.getNome() + "</nome>");
			arquivo.write("<quantidade>" + p.getQuantidade() + "</quantidade>");
			arquivo.write("<preco>" + p.getPreco() + "</preco>");
			arquivo.write("</produto>");
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
