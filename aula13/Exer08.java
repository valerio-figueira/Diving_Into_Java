package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class Exer08 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Ol�! Seja Bem-vindo.\nEste programa lhe mostrar� o valor de seu sal�rio em horas e, em seguida, o total de horas trabalhadas no m�s");
		System.out.println("Valor do Sal�rio R$ ");
		double salario = key.nextDouble();
		System.out.println("Digite as horas di�rias de trabalho: ");
		int horas = key.nextInt();
		System.out.println("Digite o n�mero de dias por semana: ");
		int dias = key.nextInt();

		int horasSemana = horas * dias;
		int horasMes = horasSemana * 4;
		double salarioHoras = salario / horasMes;
		System.out.println("Voc� ganha R$" + salarioHoras + " � hora.");
		System.out.println("Seu expediente � de " + horasMes + " horas mensais.");

	}

}
