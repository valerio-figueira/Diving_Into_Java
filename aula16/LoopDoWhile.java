package com.valerio.cursojava.aula16;

public class LoopDoWhile {

	public static void main(String[] args) {
		int i = 1; // vari�vel i para contador.
		int max = 10;

		System.out.println("Contando at� " + max);

		while (i < max) {
			System.out.println("O valor de i " + i);
			i++; // i = i + 1
		}
		System.out.println("O valor de i � " + i);

		do {
			i++;
			System.out.println("Valor de i " + i);
		} while (i < 15);
		System.out.println("Valor de i � " + i);
	}
}