package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer16v2{
	public static void main (String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	double a;//nosso A da equa��o. Por exemplo: 2X+3Y-10=0, nesse caso o "a" � o 2. 
	double b;//nosso B da equa��o. Por exemplo: 2X+3Y-10=0, nesse caso o "b" � o 3. 
	double c;//nosso C da equa��o. Por exemplo: 2X+3Y-10=0, nesse caso o "c" � o -10. 
	double delta;//nosso Delta. Delta = "B" ao quadrado menos 4 vezes "A" vezes "C". Lembra? 
	double x1;//nossa primeira raiz da equa��o. 
	double x2;//nossa segunda raiz da equa��o. 

	System.out.println("Insira o valor de A: ");
	a = scan.nextDouble();
	//a = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de A:"));//Menssagem e leitura do "a" 

	while(a==0){ //Enquanto o valor de A for igual a zero repete a mensagem e pede outro valor . 	
		System.out.println("O valor de A n�o pode ser zero a equa��o � do 2� grau !\n Digite outro valor !"); 
		System.out.println("Insira o valor de A: ");
		a = scan.nextDouble(); //Menssagem e leitura do "a" 
	} 

	System.out.println("Insira o valor de B: ");
	b = scan.nextDouble();
	System.out.println("Insira o valor de C: ");
	c = scan.nextDouble();
	// b = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de B:"));//Menssagem e leitura do "b" 
	// c = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de C:"));//Menssagem e leitura do "c" 

	delta = ((b*b)-(4*a*c));//F�rmula do Delta 
	x1 = 0;//Definindo um valor inicial para o x1 
	x2 = 0;//Definindo um valor inicial para o x2 

	if (delta >= 0){ //Se o valor de delta for maior ou igual a zero podemos resolver... 
		x1 = (-b + Math.sqrt (delta)) / ( 2*a );//equa��o do x1 
		x2 = (-b - Math.sqrt (delta)) / ( 2*a ) ;//equa��o do x2 

		System.out.println("Delta vale :"+ delta); //Mostra o valor de Delta 
		System.out.println("\nx1 vale: "+ x1 + "\n x2 vale: "+ x2); //mostra o x1 e x2. 
	} 
	else{ //sen�o(se o delta n�o for maior nem igual a zero) n�o podemos resolver com n�meros reais talves com n�meros complexos podemos... 
		System.out.println("N�o h� solu��es que possam ser expressas com o conjunto dos n�meros reais ");//avisa que o delta deu condi��o complexa 
	} }
} 