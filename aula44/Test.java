package com.valerio.cursojava.aula44;

public class Test {

	public static void main(String[] args) {
		Anfibio salamandra = new Anfibio();

		salamandra.setEsp�cie("Salamandra");
		salamandra.setNome("Axolote");
		salamandra.setNomeCientifico("Ambystoma mexicanum");
		salamandra.setCor("Escarlate");

		salamandra.nadar();
		salamandra.dormir();

		Reptil tiuBrabo = new Reptil();
		tiuBrabo.setNome("Tei�");
		tiuBrabo.setEsp�cie("Tupinambis");
		tiuBrabo.setNomeCientifico("Salvator merianae");
		tiuBrabo.setCor("Verde esmeralda");
		
		tiuBrabo.emitirSom();
		tiuBrabo.cavar();
		tiuBrabo.correr();
		
		System.out.println("Animais: ");
		System.out.println(salamandra.toString());
		System.out.println(tiuBrabo.toString());
	}
}
