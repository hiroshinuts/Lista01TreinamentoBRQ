package br.com.rtagata.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorProduto {
	
	public boolean validarIdProduto(Integer idProduto){
		return idProduto > 0;
	}
	
	public boolean validarNome(String nome){
		Pattern p = Pattern.compile("^[A-Za-zÀ-Üà-ü0-9\\s]{3,30}$");
		Matcher m = p.matcher(nome);
		
		return m.matches();
	}
	
	public boolean validarPreco(Double preco){
		return preco > 0;
	}
	
	public boolean validarQuantidade(Integer quantidade){
		return quantidade > 0;
	}

}
