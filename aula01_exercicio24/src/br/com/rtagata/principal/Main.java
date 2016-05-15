package br.com.rtagata.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import br.com.rtagata.entities.Funcionario;
import br.com.rtagata.types.EstadoCivil;
import br.com.rtagata.types.Sexo;

public class Main {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario(3, "Hiro", Sexo.Masculino, EstadoCivil.Solteiro);
		Funcionario f2 = new Funcionario(2, "Barbara", Sexo.Femino, EstadoCivil.Solteiro);
		Funcionario f3 = new Funcionario(1, "Marcio", Sexo.Masculino, EstadoCivil.Casado);
		Funcionario f4 = new Funcionario(4, "Sergio", Sexo.Masculino, EstadoCivil.Divorciado);
		Funcionario f5 = new Funcionario(5, "Ana", Sexo.Femino, EstadoCivil.Viuvo);

		// ARRAYLIST
		List<Funcionario> lista = new ArrayList<Funcionario>();

		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		lista.add(f5);

		Collections.sort(lista);

		System.out.println("Imprimindo com Arraylist");

		for (Funcionario f : lista) {
			System.out.println("Funcionario: " + f);
		}

		// SET - TreeSet
		Set<Funcionario> listaSet = new TreeSet<Funcionario>();

		listaSet.add(f1);
		listaSet.add(f2);
		listaSet.add(f3);
		listaSet.add(f4);
		listaSet.add(f5);

		System.out.println("Imprimindo com TreeSet");

		for (Funcionario f : listaSet) {
			System.out.println("Funcionario: " + f);
		}

		// MAP - HashMap

		Map<String, String> mapa = new HashMap<String, String>();

		mapa.put("chave1", new String("valor5"));
		mapa.put("chave2", new String("valor4"));
		mapa.put("chave3", new String("valor3"));
		mapa.put("chave4", new String("valor2"));
		mapa.put("chave5", new String("valor1"));

		for (String chave : mapa.keySet()) {

			String valor = mapa.get(chave);
			System.out.println(chave + " = " + valor);

		}
	}
}
