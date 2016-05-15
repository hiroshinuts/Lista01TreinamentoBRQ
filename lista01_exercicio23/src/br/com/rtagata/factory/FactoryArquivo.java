package br.com.rtagata.factory;

import br.com.rtagata.contracts.IControleArquivo;
import br.com.rtagata.controls.ControleArquivoTxt;
import br.com.rtagata.controls.ControleArquivoXml;
import br.com.rtagata.entities.Produto;
import br.com.rtagata.types.TipoArquivo;

public class FactoryArquivo {

	private IControleArquivo controle;

	public FactoryArquivo(TipoArquivo opcao) {

		switch (opcao) {

		case TXT:
			controle = new ControleArquivoTxt();
			break;

		case XML:
			controle = new ControleArquivoXml();
			break;

		}

	}

		public void gerarArquivo(Produto p){
			
			controle.abrirArquivo();
			controle.gravarDados(p);
			controle.fecharArquivo();
			
		
	}

}
