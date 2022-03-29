package com.valerio.cursojava.aula27v2;

import java.util.Random;
import java.util.Scanner;

public class ExerContaCorrente {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaCorrenteController controller = new ContaCorrenteController(new Scanner(System.in), new Random());

		cc.conta = 6570;
		cc.nome = "Jos� Val�rio";
		cc.especial = true;
		cc.saldo = 20;
		cc.limite = 200;

		if (controller.sacarSaldo(cc)) {
			System.out.println("Saque efetuado: " + cc.saldo);
		} else {
			System.out.println("N�o foi poss�vel efetuar saque;");
		}
	}
}
