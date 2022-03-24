package com.valerio.cursojava.aula27;

import java.util.Scanner;

public class ContaCorrente {
	int conta;
	double saque;
	String nome;
	double saldo, saldoEspecial;
	boolean especial;

	Scanner input = new Scanner(System.in);

	double sacarDinheiro(double saldo) {
		saque = 0;
		if (saldo > 0) {
			do {
				System.out.println(saldo + "R$ dispon�vel para saque.");
				System.out.print("Digite o valor do saque: ");
				saque = input.nextDouble();
				if (saque > saldo) {
					System.out.println("Saldo indispon�vel");
				}
			} while (saque > saldo);

		} else {
			System.out.println("Saldo indispon�vel.");
			if (especial) {
				this.saldoEspecial = gastarEspecial(0);
			}
		}
		return saldo -= saque;
	}

	double depositarDinheiro(double dinheiro) {
		System.out.print("Digite o valor do dep�sito: ");
		dinheiro = input.nextDouble();
		return dinheiro + this.saldo;
	}

	void consultarSaldo() {
		System.out.println("Seu saldo dispon�vel: R$" + this.saldo);
	}

	void getChequeEspecial() {
		if (this.especial == true) {
			System.out.println("Especial | Limite Dispon�vel: R$" + this.saldoEspecial);
		}
	}

	double gastarEspecial(double saque) {
		if (saldoEspecial > 0) {
			do {
				System.out.println("Cheque Especial R$" + this.saldoEspecial);
				System.out.println("Digite o valor do saque Especial: ");
				saque = input.nextDouble();
				if (saque > this.saldoEspecial) {
					System.out.println("Saldo indispon�vel");
				}
			} while (saque > this.saldoEspecial);
		}
		return this.saldoEspecial -= saque;
	}

	int home(int menu) {
		boolean sair = false;
		while (!sair) {
			System.out.println("::::::::: Banco Caixa Econ�mica :::::::::");
			System.out.println("Nome: " + this.nome + " | N� Conta: " + this.conta);
			if (this.especial == true) {
				this.getChequeEspecial();
			}
			System.out.println("1 - Saque\n2 - Dep�sito\n3 - Consulta");
			menu = input.nextInt();
			if (menu != 1 && menu != 2 && menu != 3) {
				System.out.println("N�o existe essa op��o.");
			} else {
				sair = true;
			}
		}
		return menu;
	}
}