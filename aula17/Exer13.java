package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer13 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		double base, exp, i = 1, produto;

		System.out.println("Digite o n�mero base: ");
		base = key.nextDouble();
		System.out.println("Digite o expoente deste n�mero: ");
		exp = key.nextDouble();

		for (produto = base; i < exp; i++) {
			produto *= base;
			System.out.println("O produto � " + produto);
		}

	}

}
