package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, i;
		boolean primo = true;
		num = (int) Math.round(Math.random() * 10);

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("N�mero composto.");
				primo = false;
			}
		}
		if (num > 1 && primo) {
			System.out.println("N�mero primo: "+num);
		} else {
			System.out.println("N�mero composto: "+num);
		}

	}

}
