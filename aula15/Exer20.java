package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Boolean ligacao, local, residencia, debito, trabalho;

		System.out.println("Responda com \"true\" para verdadeiro ou \"false\" para falso:");
		System.out.println("Telefonou para a v�tima?");
		ligacao = key.nextBoolean();
		System.out.println("Esteve no local do crime?");
		local = key.nextBoolean();
		System.out.println("Mora perto da v�tima?");
		residencia = key.nextBoolean();
		System.out.println("Devia para a v�tima?");
		debito = key.nextBoolean();
		System.out.println("J� trabalhou com a v�tima?");
		trabalho = key.nextBoolean();
		// 2 suspeito, 3/4 c�mplice, 5 assassino. O contr�rio � inocente.

		if (ligacao == local && ligacao != residencia && ligacao != debito && ligacao != trabalho
				|| ligacao == residencia && ligacao != local && ligacao != debito && ligacao != trabalho
				|| ligacao == debito && ligacao != local && ligacao != residencia && ligacao != trabalho
				|| ligacao == trabalho && ligacao != local && ligacao != residencia && ligacao != debito) {
			System.out.println("H� duas participa��es no crime, � suspeito.");
		} else {
			System.out.println("Inv�lido.");
		}

	}
}
