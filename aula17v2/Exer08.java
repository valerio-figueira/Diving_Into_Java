package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0, cont = 1, maior = num, soma = 0;
		double media = 0;

		for (num = 0; cont <= 5; cont++, soma += num, media = soma / 5) {
			System.out.println("Digite um n�mero:");
			num = key.nextInt();

			if (num > maior) {
				maior = num;
			}
		}
		System.out.println(maior + " � o maior deles.");
		System.out.println(soma + " � a soma.");
		System.out.println(media + " � a m�dia.");

	}

}
