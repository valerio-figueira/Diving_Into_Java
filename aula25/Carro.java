package com.valerio.cursojava.aula25;

public class Carro { // define o objeto
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void/* tipo do m�todo e a seguir o nome do m�todo */ exibirAutonomia(/* par�metros: argumentos */) {
		/* bloco de c�digos */
		System.out.println("A autonomia do carro � de: " + capCombustivel * consumoCombustivel + " km");
	}
}