package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		int num1 = key.nextInt();
		System.out.println("Digite o primeiro n�mero: ");
		int num2 = key.nextInt();
		System.out.println("Digite o primeiro n�mero: ");
		int num3 = key.nextInt();

		if (num1 < num2 && num1 < num3) {
			System.out.println("Menor n�mero � " + num1);
		} else if (num2 < num3 && num2 < num1) {
			System.out.println("Menor n�mero � " + num2);
		} else if (num3 < num2 && num3 < num1) {
			System.out.println("Menor n�mero � " + num3);
		} else {System.out.println("Voc� digitou n�meros iguais.");}

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior � " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior � " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior � " + num3);
		} else {System.out.println("Voc� digitou n�meros iguais.");}

	}

}
