package com.valerio.cursojava.aula39;

import com.valerio.cursojava.aula39.TesteVisibilidade.Aluno;

public class Teste {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		Professor p = new Professor();

		a.setNome(null);
		a.setTelefone(null);
		a.setNumCelular(null);
		p.setNome(null);
		p.setTelefone(null);
		p.setNumCelular(null);

		Pessoa aluno = new Aluno(); // s� tem acesso aos atributos comuns da classe Pessoa e n�o da classe Aluno
		Pessoa professor = new Professor(); // Super classe, classe m�e/pai.
		aluno.getNome();
		professor.getNome();

		a.nomeProtected = "";
		a.nomePublic = "";
		// N�o aparece o default porque ele n�o � vis�vel para sub-classes

		// A heran�a � um relacionamento do tipo um-para-um
	}
}