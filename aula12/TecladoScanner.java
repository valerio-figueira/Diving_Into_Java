package com.valerio.cursojava.aula12;

import java.util.Scanner;
public class TecladoScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu primeiro nome, sua idade, quantidade de filhos, altura, se tem animal de estima��o: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();

		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Animal de estima��o: " + temPet);
		
	}

}
