package br.com.rtagata.controls;

import br.com.rtagata.entities.Funcionario;

public class ControleSalario {

	public Double mostraSalarioBruto(Funcionario f) {

		double salarioBruto = f.getSalario();

		return salarioBruto;
	}

	public Double salarioBruntoComDescontoVt(Funcionario f) {

		double vt = mostraSalarioBruto(f) * 0.06;

		return vt;

	}

	public Double salarioBrutoComDescontoInss(Funcionario f) {

		double inss = mostraSalarioBruto(f);

		if (f.getSalario() < 1500) {

			return inss * 0.09;

		} else if (f.getSalario() >= 1500 && f.getSalario() <= 2500) {

			return inss * 0.10;

		} else {
			return inss * 0.11;
		}

	}

	public Double salarioLiquido(Funcionario f) {

		double salarioComDesconto = mostraSalarioBruto(f) - salarioBruntoComDescontoVt(f)
				- salarioBrutoComDescontoInss(f);
		return salarioComDesconto;
	}

}
