package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class RaioDaCircunferencia {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Ol�, seja Bem-vindo!\nEste � um programa para calcular a circunfer�ncia de um c�rculo a partir do raio.");
		System.out.println("Digite o valor do raio: ");
		double raio = key.nextDouble();
		double circunferencia = 2 * 3.14 * raio;
		System.out.println("A circunfer�ncia �: " + circunferencia);

	}

}
