package com.valerio.cursojava.aula20;

import java.util.Random;

public class Exer03 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] a = new int[3][3];
		int pares = 0, impares = 0;
		String output = "";
		System.out.println("Matriz M:");

		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				a[i][p] = random.nextInt(9);
				System.out.print(a[i][p] + " ");
				if (a[i][p] % 2 == 0 || a[i][p] % 2 == 0) {
					if (a[i][p] != 0) {
						output += "\nN�meros pares: " + a[i][p];
						pares++;
					}
				} else {
					if (a[i][p] != 0) {
						output += "\nN�meros �mpares: " + a[i][p];
						impares++;
					}
				}
			}
			System.out.println();
		}
		System.out.println(output);
		System.out.print("\nQuantidade de n�meros pares: " + pares);
		System.out.print("\nQuantidade de n�meros �mpares: " + impares);
	}
}
