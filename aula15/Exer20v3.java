package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer20v3 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String p1, p2, p3, p4, p5;
		int resultado = 0;

		System.out.println("Responda \"Sim\" ou \"N�o\":");
		System.out.println("Telefonou para a v�tima?");
		p1 = key.next();
		System.out.println("Esteve no local do crime?");
		p2 = key.next();
		System.out.println("Mora perto da v�tima?");
		p3 = key.next();
		System.out.println("Devia para a v�tima?");
		p4 = key.next();
		System.out.println("J� trabalhou com a v�tima?");
		p5 = key.next();
		// 2 suspeito, 3/4 c�mplice, 5 assassino. O contr�rio � inocente.

		if (p1.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p1.equalsIgnoreCase("N�o")) {
		}

		if (p2.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p2.equalsIgnoreCase("N�o")) {
		}

		if (p3.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p3.equalsIgnoreCase("N�o")) {
		}

		if (p4.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p4.equalsIgnoreCase("N�o")) {
		}

		if (p5.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p5.equalsIgnoreCase("N�o")) {
		}

		if (resultado == 0) {
			System.out.println("� inocente.");
		} else if (resultado == 2) {
			System.out.println("� suspeito.");
		} else if (resultado == 3 || resultado == 4) {
			System.out.println("� c�mplice.");
		} else if (resultado == 5) {
			System.out.println("� assassino.");
		}
	}
}