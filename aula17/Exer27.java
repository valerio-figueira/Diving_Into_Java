package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double menor, maior, temp, soma, media = 0;
		int i = 1;
		
		System.out.println("Digite a " + i + "� temperatura: ");
		temp = input.nextDouble();
		menor = maior = temp;
		soma = temp;
		while (temp != 0) {
			i++;
			System.out.println("Digite a " + i + "� temperatura: ");
			temp = input.nextDouble();
			media += temp;
			if (temp != 0) {
				if (temp > maior) {
					maior = temp;
				} else if (temp < menor) {
					menor = temp;
				}
			}
			if (temp == 0) {
				System.out.println("maior " + maior +"� graus.");
				System.out.println("menor " + menor +"� graus.");
				media = media + soma;
				i--;
				System.out.println("A m�dia de temperatura �: " + media/i+"� graus.");
			}
		}
	}
}