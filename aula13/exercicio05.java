package com.valerio.cursojava.aula13;
import java.util.Scanner;
public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		System.out.println("Ol�! Este � um conversor de metros para cent�metros.");
		System.out.println("Para continuar, digite o valor em metros: ");
		double m = key.nextDouble();
		double cm = m * 100;
		System.out.println("metros: " + m);
		System.out.println("cm: " + cm);
		System.out.println("Enjoy!");
	}

}
