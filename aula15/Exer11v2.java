package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer11v2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		double salario, reajuste;

		System.out.println("Digite o valor de seu sal�rio R$ ");
		salario = key.nextDouble();

		if (salario <= 280.00) {
			reajuste = (salario * 20) / 100;
			System.out.println("Sal�rio antes do reajuste � de R$"+salario);
			System.out.println("Sua porcentagem � de 20%");
			System.out.println("Valor do aumento R$"+reajuste);
			System.out.println("Novo sal�rio R$"+ (salario + reajuste));
		} else if (salario > 280.00 && salario <= 700.00) {
			reajuste = (salario * 15) / 100;
			System.out.println("Sal�rio antes do reajuste � de R$"+salario);
			System.out.println("Sua porcentagem � de 15%");
			System.out.println("Valor do aumento R$"+reajuste);
			System.out.println("Novo sal�rio R$"+ (salario + reajuste));
		} else if (salario > 700.00 && salario <= 1500) {
			reajuste = ((salario * 10) / 100);
			System.out.println("Sal�rio antes do reajuste � de R$"+salario);
			System.out.println("Sua porcentagem � de 10% ");
			System.out.println("Valor do aumento R$"+reajuste);
			System.out.println("Novo sal�rio R$"+ (salario + reajuste));
		} else if (salario > 1500) {
			reajuste = (salario * 5) / 100;
			System.out.println("Sal�rio antes do reajuste � de R$"+salario);
			System.out.println("Sua porcentagem � de 5%");
			System.out.println("Valor do aumento R$"+reajuste);
			System.out.println("Novo sal�rio R$"+ (salario + reajuste));
		}
		
		

	}

}
