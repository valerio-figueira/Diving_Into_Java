package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer17 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int ano = 0;
		
		System.out.println("Digite o n�mero de um determinado ano: ");
		ano = key.nextInt();
		
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " � um ano Bissexto!");
		}
		else{
			System.out.println(ano + " n�o � um ano Bissexto!");
		}

	}
}
