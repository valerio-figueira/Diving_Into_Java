package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int i, cont, nota, media, soma = 0;

		System.out.println("Digite a quantidade de notas:");
		i = key.nextInt();

		for (cont = 1, media = 0; cont <= i; cont++) {
			System.out.println("Digite a " + cont + "� nota:");
			nota = key.nextInt();
			media += nota;
			if (cont == i) { media = media /i;
				System.out.println(media + " sua m�dia.");
			}
			soma += nota;
		} System.out.println(soma+" � a soma das notas.");
	}

}
