package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer24v2 {

	public static void main(String[] args) {
		int a[] = new int[10];
		boolean entrada = true;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite um n�mero: ");
			a[i] = input.nextInt();
		}
		for (int i = 0; i < a.length / 2; i++) {
			if (a[a.length - i - 1] == a[i]) {
				System.out.println("� pal�ndromo.");
				break;
			} else {
				System.out.println("N�o � pal�ndromo.");
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (entrada == true) {
				System.out.print("A: ");
				entrada = false;
			}
			System.out.print(a[i] + ".");
		}
	}
}
