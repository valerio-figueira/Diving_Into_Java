package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class Exer08v3 {
	static Scanner key = new Scanner(System.in);
	
	public static void main(String[] args) {		

		System.out.println("Digite o valor do Sal�rio em horas R$ ");
		double salarioHoras = key.nextDouble();
		System.out.println("Digite as horas de trabalho no m�s: ");
		double horasMes = key.nextDouble();
		double salarioTotal = salarioHoras * horasMes;
		System.out.println("O total do seu sal�rio �:" + salarioTotal);

	}

}