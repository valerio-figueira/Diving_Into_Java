package com.valerio.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
	
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta �";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
	
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		System.out.println(resultado++); //primeiro imprime o valor do resultado e logo em seguida adiciona ++ ao valor imprimido, por�m o valor s� ser� imprimido no pr�ximo print.out
		System.out.println(resultado);
		System.out.println(++resultado); //aqui o acr�scimo vem antes do print.out, fazendo com que aparece�a o acr�scimo assim que o programa for executado.
		
		resultado += 1;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(resultado);
		
	}

}
