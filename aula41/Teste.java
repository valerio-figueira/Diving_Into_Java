package com.valerio.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		aluno.setEndere�o("Rua Vit�ria, N� 59");
		professor.setEndere�o("Rua Santo Ant�o, N� 105");

		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());

		aluno.setNome("Percival");
		professor.setNome("Arthur");

		aluno.obterNome();
		professor.obterNome();

		aluno.setTelefone("(34)9971-3655");
		professor.setTelefone("(34)9988-4555");
		
		aluno.obterTelefone();
		professor.obterTelefone();
	}
}