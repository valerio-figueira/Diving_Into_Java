package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		double num1 = key.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double num2 = key.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		double num3 = key.nextDouble();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro n�mero digitado � o maior deles.");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O segundo n�mero digitado � o maior deles.");
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("O terceiro n�mero digitado � o maior deles.");
		} else if (num1 == num2 && num1 > num3 || num1 == num3 && num1 > num2 || num3 == num1 && num3 > num2
				|| num2 == num3 && num2 > num1) {
			System.out.println("Dois s�o iguais e maiores que o outro.");
		} else if (num1 == num2 || num1 == num3 || num2 == num1 || num2 == num3 || num3 == num1 || num3 == num2) {
			System.out.println("Os n�meros s�o iguais.");
		}
	}

}
