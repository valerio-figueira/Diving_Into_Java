package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer20v2 {
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

		if (resultado >= 0 || resultado <= 5) {
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
				System.out.println("Inocente.");
			} else if (resultado == 2) {
				System.out.println("Suspeito.");
			} else if (resultado == 3 || resultado == 4) {
				System.out.println("C�mplice.");
			} else if (resultado == 5) {
				System.out.println("Assassino.");
			}
		}
	}
}

/*
 * if (p1.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p1.equalsIgnoreCase("N�o"))
 * 
 * if (p2.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p2.equalsIgnoreCase("N�o"))
 * 
 * if (p3.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p3.equalsIgnoreCase("N�o"))
 * 
 * if (p4.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p4.equalsIgnoreCase("N�o"))
 * 
 * if (p5.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p5.equalsIgnoreCase("N�o"))
 * 
 * 
 * if (resultado == 2) { System.out.println("Suspeito."); } else if (resultado
 * == 3 || resultado == 4) { System.out.println("C�mplice."); } else if
 * (resultado == 5) { System.out.println("Assassino."); } else if (resultado ==
 * 0) { System.out.println("Inocente."); }
 */

/*
 * if (ligacao.equalsIgnoreCase("Sim")) { resultado++; if
 * (local.equalsIgnoreCase("Sim")) { resultado++; if
 * (residencia.equalsIgnoreCase("Sim")) { resultado++; if
 * (debito.equalsIgnoreCase("Sim")) { resultado++; if
 * (trabalho.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (trabalho.equalsIgnoreCase("N�o")) { resultado = 0; } else if
 * (debito.equalsIgnoreCase("N�o")) { resultado = 0; } } else if
 * (residencia.equalsIgnoreCase("N�o")) { resultado = 0; } } else if
 * (local.equalsIgnoreCase("N�o")) { resultado = 0; } } else if
 * (ligacao.equalsIgnoreCase("N�o")) { resultado = 0; } if (resultado == 2) {
 * System.out.println("� suspeito."); } else if (resultado == 3 || resultado ==
 * 4) { System.out.println("� c�mplice."); } else if (resultado == 5) {
 * System.out.println("� assassino."); }
 * 
 * }
 */

/*
 * if (ligacao.equalsIgnoreCase("Sim")) { resultado++; if
 * (ligacao.equalsIgnoreCase("N�o")) { resultado=0; if
 * (local.equalsIgnoreCase("Sim")) { resultado++; if
 * (local.equalsIgnoreCase("N�o")) { resultado=0; if
 * (residencia.equalsIgnoreCase("Sim")) { resultado++; if
 * (residencia.equalsIgnoreCase("N�o")) { resultado=0; if
 * (debito.equalsIgnoreCase("Sim")) { resultado++; if
 * (debito.equalsIgnoreCase("N�o")) { resultado=0; if
 * (trabalho.equalsIgnoreCase("Sim")) { resultado++; if
 * (trabalho.equalsIgnoreCase("N�o")) { resultado=0; if (resultado == 2) {
 * System.out.println("� suspeito."); } else if (resultado == 3 || resultado ==
 * 4) { System.out.println("� c�mplice."); } else if (resultado == 5) {
 * System.out.println("� assassino."); } } } } } } } } } }
 * 
 * 
 * }
 */
