package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double num1, num2, resultado;
		String operacao;
		resultado = 0;

		System.out.println("Digite o primeiro n�mero:");
		num1 = key.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		num2 = key.nextDouble();
		System.out.println("Qual opera��o deseja realizar?");
		operacao = key.next();

		if (operacao.equalsIgnoreCase("divis�o") || operacao.equalsIgnoreCase("/")) {
			resultado = num1 / num2;
			System.out.println("O resultado da divis�o �: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado � um n�mero positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado � um n�mero negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado � um n�mero par.");
			} else if (resultado % 2 != 0) {
				System.out.println("O resultado � um n�mero �mpar.");
			} else {
				System.out.println("Inv�lido.");
			}
		}
		if (operacao.equalsIgnoreCase("multiplica��o") || operacao.equalsIgnoreCase("*")) {
			resultado = num1 * num2;
			System.out.println("O resultado da divis�o �: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado � um n�mero positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado � um n�mero negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado � um n�mero par.");
			} else if (resultado % 2 != 0) {
				System.out.println("O resultado � um n�mero �mpar.");
			} else {
				System.out.println("Inv�lido.");
			}
		}
		if (operacao.equalsIgnoreCase("adi��o") || operacao.equalsIgnoreCase("+")) {
			resultado = num1 + num2;
			System.out.println("O resultado da divis�o �: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado � um n�mero positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado � um n�mero negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado � um n�mero par.");
			} else if (resultado % 2 != 0) {
				System.out.println("O resultado � um n�mero �mpar.");
			} else {
				System.out.println("Inv�lido.");
			}
		}
		if (operacao.equalsIgnoreCase("subtra��o") || operacao.equalsIgnoreCase("-")) {
			resultado = num1 - num2;
			System.out.println("O resultado da divis�o �: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado � um n�mero positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado � um n�mero negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado � um n�mero par.");
			} else if (resultado % 2 != 0) {
				System.out.println("O resultado � um n�mero �mpar.");
			} else {
				System.out.println("Inv�lido.");
			}
		}
	}

}
