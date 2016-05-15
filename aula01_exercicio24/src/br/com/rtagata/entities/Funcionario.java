package br.com.rtagata.entities;

import br.com.rtagata.types.EstadoCivil;
import br.com.rtagata.types.Sexo;

public class Funcionario implements Comparable<Funcionario> {

	private Integer idFuncionario;
	private String nome;
	private Sexo sexo;
	private EstadoCivil estadoCivil;

	public Funcionario() {

	}

	public Funcionario(Integer idFuncionario, String nome, Sexo sexo, EstadoCivil estadoCivil) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", sexo=" + sexo + ", estadoCivil="
				+ estadoCivil + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Funcionario) {

			Funcionario f = (Funcionario) obj;
			return f.equals(idFuncionario);

		}

		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return idFuncionario.hashCode();
	}

	@Override
	public int compareTo(Funcionario f) {

		if (f.getIdFuncionario() != null) {

			return f.getIdFuncionario();
		}
		return f.getIdFuncionario();
	}

}
