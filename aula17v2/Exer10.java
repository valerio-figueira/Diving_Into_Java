package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a, b, soma;

		System.out.println("Digite o 1� n�mero inteiro:");
		a = key.nextInt();
		System.out.println("Digite o 2� n�mero inteiro:");
		b = key.nextInt();
		if (a < b) {
			a++;
			while (a < b) {
				System.out.println(a);
				a++;
			}
		} else if (b < a) {
			b++;
			while (b < a) {
				System.out.println(b);
				b++;
			}
		}
	}

}