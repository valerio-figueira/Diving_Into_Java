package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer04v3 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite uma vogal ou consoante: ");
		String letra = key.nextLine();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Voc� digitou uma vogal.");

		} else {
			System.out.println("Voc� digitou uma consoante");
		}
	}
}
