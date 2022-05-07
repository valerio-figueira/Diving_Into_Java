package com.valerio.cursojava.aula45;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String numCelular;

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String obterEndereco() {
		return this.endereco;
	}

	public Pessoa(String nome, String endere�o, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endere�o;
		this.telefone = telefone;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endereco;
	}

	public void setEndere�o(String endere�o) {
		this.endereco = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		String info = "Nome: " + nome;
		return info += "\nEndere�o: " + this.endereco;
	}

}
