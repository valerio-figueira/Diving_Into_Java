package com.valerio.cursojava.aula19v2;

public class Exer23 {

	public static void main(String[] args) {
		int a[] = new int[10];
		boolean prosseguir = true;
		for (int i = 0; i < a.length && prosseguir == true; i++) {
			a[i] = (int) Math.round(Math.random() * 100);
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " � um n�mero par.");
			} else {
				prosseguir = false;
				System.out.println("H� pelo menos um n�mero �mpar no conjunto.");
			}
		}
	}
}