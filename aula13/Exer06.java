package com.valerio.cursojava.aula13;
import java.util.Scanner;
public class Exer06 {
	static Scanner key = new Scanner (System.in);
	public static void main(String[] args) {
				
		System.out.println("Este � um programa para calcular a �rea de um circunfer�ncia a partir do raio.");
		System.out.println("Digite o raio da circunfer�ncia: ");
		double raio = key.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("�rea do c�rculo �: " + area);
	}

}