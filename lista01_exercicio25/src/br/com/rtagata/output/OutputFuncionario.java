package br.com.rtagata.output;

import br.com.rtagata.controls.ControleSalario;
import br.com.rtagata.entities.Funcionario;

public class OutputFuncionario {

	public void imprimirDados(Funcionario f) {

		ControleSalario cs = new ControleSalario();

		System.out.println("Id do Funcionario.........:" + f.getIdFuncionario());
		System.out.println("Nome do Funcionario.......:" + f.getNome());
		System.out.println("Salario Bruto.............:" + f.getSalario());
		System.out.println("Desconto Vt...............:" + cs.salarioBruntoComDescontoVt(f));
		System.out.println("Desconto INSS.............:" + cs.salarioBrutoComDescontoInss(f));
		System.out.println("Salario Liquido...........:" + cs.salarioLiquido(f));

	}

}
