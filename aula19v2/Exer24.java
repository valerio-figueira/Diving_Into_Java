package com.valerio.cursojava.aula19v2;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite um n�mero: ");
			a[i] = key.nextInt();
		}
		boolean palindromo = true;

		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				System.out.println("N�o � pal�ndromo.");
				palindromo = false;
				break;
			}
		}
		if (palindromo == true) {
			System.out.println("� pal�ndromo.");
		} else {
			System.out.println("N�o � pal�ndromo.");
		}
	}
}
