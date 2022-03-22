package com.valerio.cursojava.aula19;

public class Exer35 {

	public static void main(String[] args) {
		int a[] = new int[10];
		boolean entrada = true;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 20);
			if (entrada == true) {
				System.out.print("Entrada: ");
				entrada = false;
			}
			System.out.print(a[i] + ".");
		}
		System.out.print("\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\n");
			System.out.print("Os divisores de " + a[i] + ": ");
			for (int z = 1; z < a[i]; z++) {
				if (a[i] % z == 0) {
					System.out.print(z + ".");
				}
			}
		}
	}
}