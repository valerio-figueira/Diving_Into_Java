package com.valerio.cursojava.aula27;

public class Carro { /* Declara��o do objeto. */
	String marca; // Declara��o dos atributos do objeto.
	String modelo; // Declara��o dos atributos do objeto.
	int numPassageiros; // Declara��o dos atributos do objeto.
	double capCombustivel; // Declara��o dos atributos do objeto.
	double consumoCombustivel; // Declara��o dos atributos do objeto.

	void/* Tipo do m�todo. */ exibirAutonomia(/* Par�metros: argumentos. */) {
		System.out.println("A autonomia do carro � de: " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia/* Nome do m�todo. */() {
		System.out.println("O m�todo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel; // Retorna resultado para classe TesteCarro
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
}