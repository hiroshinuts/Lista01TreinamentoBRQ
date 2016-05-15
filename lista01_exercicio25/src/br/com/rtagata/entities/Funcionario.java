package br.com.rtagata.entities;

public class Funcionario {

	private Integer idFuncionario;
	private String nome;
	private Double salario;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer idFuncionario, String nome, Double salario) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Funcionario) {
			Funcionario f = (Funcionario) obj;
			return f.getIdFuncionario().equals(idFuncionario);
		}

		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return idFuncionario.hashCode();
	}

}
