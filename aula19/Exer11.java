package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer11 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = new int[5];
		int par = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite o " + (i + 1) + "� n�mero inteiro:");
			a[i] = key.nextInt();

			if (a[i] % 2 == 0) {
				par++;
				System.out.println("O " + (i + 1) + "� n�mero � par: " + a[i] + "\n");
			} else {
				System.out.println("O " + (i + 1) + "� n�mero � �mpar: " + a[i] + "\n");
			}
		}
		System.out.println("A quantidade de n�meros pares digitada: " + par);
	}
}
