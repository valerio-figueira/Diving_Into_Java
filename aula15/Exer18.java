package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer18 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		System.out.println("Digite um n�mero:");
		num = key.nextInt();
		
		if (num % 2 == 0) {System.out.println(num+" � um n�mero par.");}
		else {System.out.println("� um n�mero �mpar.");}
	}

}
