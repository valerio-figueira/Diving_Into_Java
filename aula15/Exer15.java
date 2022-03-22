package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double lado1, lado2, lado3, perimetro;
		perimetro = 0;

		System.out.println("Digite o valor do primeiro lado do tri�ngulo: ");
		lado1 = key.nextDouble();
		System.out.println("Digite o valor do segundo lado do tri�ngulo: ");
		lado2 = key.nextDouble();
		System.out.println("Digite o valor do terceiro lado do tri�ngulo: ");
		lado3 = key.nextDouble();

		if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)) {
			perimetro = lado1 + lado2 + lado3;
			System.out.println("Os tr�s lados formam um tri�ngulo.");
			System.out.println("O per�metro do tri�ngulo �: " + perimetro);
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Os lados formam um tri�ngulo Equil�tero.");
			} else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2
					|| lado2 == lado3 && lado2 != lado1) {
				System.out.println("Os lados formam um tri�ngulo Is�sceles.");
			} else if (lado1 != lado2 && lado1 != lado3) {
				System.out.println("Os lados formam um tri�ngulo Escaleno.");
			}

		} else {
			System.out.println("N�o � um tri�ngulo");
		}

	}

}
