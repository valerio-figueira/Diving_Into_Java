package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer01 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = key.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = key.nextInt();
		
		if (num1 > num2) {System.out.println(num1+" � maior que "+num2);}
		else if (num1 == num2) {System.out.println("Ambos s�o iguais.");}
		
		 else System.out.println(num2+" � maior que "+num1);
		
	

		
	}

}
