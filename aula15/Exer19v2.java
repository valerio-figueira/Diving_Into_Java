package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer19v2 {
	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int num1, num2;
		double resultado;
		boolean valido = true;
		String entrada;
		resultado = 0;

		System.out.println("Programa de Opera��es");

		System.out.println("Digite um n�mero: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo n�mero:");
		num2 = programa.nextInt();

		System.out.println("Tecla o tipo de opera��o: + - * /");
		entrada = programa.next();

		switch (entrada) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			valido = false;
			System.out.println("N�o � uma opera��o v�lida.");
		}

		if (valido) {
			System.out.println("Resultado: " + resultado);
			if (resultado >= 0) {
				System.out.println("Resultado � positivo.");
			} else {
				System.out.println("Resultado � negativo.");
			}

			if (resultado % 2 == 0) {
				System.out.println("Resultado � um n�mero par.");
			} else {
				System.out.println("Resultado � um n�mero �mpar.");
			}
		}
	}
}