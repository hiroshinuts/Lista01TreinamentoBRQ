package br.com.rtagata.input;

import java.util.Scanner;

import br.com.rtagata.validators.ValidadorProduto;

public class InputProduto {

	private Scanner s;
	private ValidadorProduto validador;

	public InputProduto() {

		s = new Scanner(System.in);
		validador = new ValidadorProduto();

	}

	public Integer lerIdProduto() {

		try {

			System.out.println("Informe o Id do Produto.........:");
			int idProduto = Integer.parseInt(s.nextLine());

			if (validador.validarIdProduto(idProduto)) {
				return idProduto;
			} else {
				throw new Exception("Id do Produto invalido");
			}
		} catch (Exception e) {
			System.out.println("Erro no Id do Produto");
			return lerIdProduto();
		}

	}

	public String lerNome() {

		try {

			System.out.println("Informe o Nome do Produto.......:");
			String nome = s.nextLine();

			if (validador.validarNome(nome)) {
				return nome;
			} else {
				throw new Exception("Nome do produto invalido");
			}
		} catch (Exception e) {
			System.out.println("Erro no nome do Produto");
			return lerNome();
		}

	}

	public Integer lerQuantidade() {

		try {
			System.out.println("Informe a Quantidade do Produto..:");
			Integer quantidade = s.nextInt();

			if (validador.validarQuantidade(quantidade)) {

				return quantidade;
			} else {
				throw new Exception("Quantidade do produto invalido");
			}
		} catch (Exception e) {
			System.out.println("Erro na quantidade do produto");
			return lerQuantidade();
		}

	}

	public Double lerPreco() {

		try {
			System.out.println("Informe o Preco do Produto........:");
			Double preco = s.nextDouble();

			if (validador.validarPreco(preco)) {
				return preco;
			} else {
				throw new Exception("Preco do produto invalido");
			}

		} catch (Exception e) {
			System.out.println("Erro no preco do produto");
			return lerPreco();
		}
	}

}
