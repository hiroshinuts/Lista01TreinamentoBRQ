package br.com.rtagata.principal;

import br.com.rtagata.entities.Funcionario;
import br.com.rtagata.input.InputFuncionario;
import br.com.rtagata.output.OutputFuncionario;

public class Main {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		InputFuncionario input = new InputFuncionario();
		OutputFuncionario out = new OutputFuncionario();

		f.setIdFuncionario(input.lerIdFuncionario());
		f.setNome(input.lerNome());
		f.setSalario(input.lerSalario());

		out.imprimirDados(f);

	}

}
