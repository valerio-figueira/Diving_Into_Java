package com.valerio.cursojava.aula24;

public class TesteLivroDeLivraria {
	public static void main(String[] args) {
		LivroDeLivraria livro = new LivroDeLivraria();

		livro.title = "Metaf�sica";
		livro.author = "Arist�teles";
		livro.publishing = "Editora Paulus";
		livro.description = "O fil�sofo grego discorre sobre temas acerca da filosofia primeira e filosofia segunda, o ser enquanto ser, etc";
		livro.pages = 352;
		livro.price = 89.90;
	}
}
