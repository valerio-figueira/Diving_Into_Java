package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer10 {
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Vetor A | Digite o " + (i + 1) + "� vetor: ");
			a[i] = key.nextInt();
			b[i] = a[i] % 2;
			System.out.println("Vetor B | Resto da divis�o A / 2 do " + (i + 1) + "� vetor: " + b[i]);
		}
	}

}
