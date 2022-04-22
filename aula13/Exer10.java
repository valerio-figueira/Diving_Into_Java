package com.valerio.cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer10 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Programa conversor de Farenheit para Celsius.\nDigite os graus em Celsius: ");
		double celsius = key.nextDouble();
		double farenheit = (celsius * 5 / 9) + 32;
		System.out.println("Resultado em Farenheit: " + new DecimalFormat("0.##").format(farenheit) + "�F");
	}

}
