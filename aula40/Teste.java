package com.valerio.cursojava.aula40;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndere�o("Rua Angenor, N� 45");
		aluno.setEndere�o("Rua Vit�ria, N� 59");
		professor.setEndere�o("Rua Santo Ant�o, N� 105");
		
		System.out.println(pessoa.obterEndereco());
		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());
	}
}