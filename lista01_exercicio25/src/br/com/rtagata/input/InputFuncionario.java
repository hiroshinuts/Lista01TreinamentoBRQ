package br.com.rtagata.input;

import java.util.Scanner;

import br.com.rtagata.validators.ValidatorFuncionario;

public class InputFuncionario {

	private Scanner s;
	private ValidatorFuncionario validator;

	public InputFuncionario() {

		s = new Scanner(System.in);
		validator = new ValidatorFuncionario();
	}

	public Integer lerIdFuncionario() {

		try {

			System.out.println("Informe o Id do Funcionario");
			int idFuncionario = Integer.parseInt(s.nextLine());

			if (validator.validarIdFuncionario(idFuncionario)) {
				return idFuncionario;
			} else {
				throw new Exception("Id do Funcionario invalido");
			}
		} catch (Exception e) {
			System.out.println("Erro no id do Funcionario");
			return lerIdFuncionario();
		}
	}

	public String lerNome() {

		try {
			System.out.println("Informe o Nome do Funcionario");
			String nome = s.nextLine();

			if (validator.validarNome(nome)) {
				return nome;
			} else {
				throw new Exception("Nome do Funcionario Invalido");
			}
		} catch (Exception e) {
			System.out.println("Erro no nome do Funcionario");
			return lerNome();
		}

	}

	public Double lerSalario() {

		try {
			System.out.println("Informe o Salario do Funcionario");
			Double salario = s.nextDouble();

			if (validator.validarSalario(salario)) {
				return salario;
			} else {
				throw new Exception("Salario do Funcionario Invalido");
			}
		} catch (Exception e) {
			System.out.println("Erro no salario do Produto");
			return lerSalario();
		}

	}

}