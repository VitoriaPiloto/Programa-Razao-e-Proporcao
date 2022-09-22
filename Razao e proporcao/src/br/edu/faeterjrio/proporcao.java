package br.edu.faeterjrio;

import java.util.Scanner;

public class proporcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 QUESTÃO 01: 
		 .. DIVISÃO PROPORCIONAL
		 VALORES: 580 
		 EM PARTES DE 7, 10 E 12
		 ------ > Resultados: A, 140 ; B, 200 ; C, 240
		 */
		float valorTotal, valorDividido, parteA, parteB, parteC;
		int a,b,c, parteTotal;
		Scanner in = new Scanner(System.in);
		System.out.println("--------- PROGRAMA DIVISÃO PROPORCIONAL ---------\n\n");
		System.out.println("Insira o valor total a ser dividido:");
		valorTotal = in.nextFloat();
		System.out.println("Insira a primeira parte a ser dividida:");
		a = in.nextInt();
		System.out.println("Insira a segunda parte a ser dividida:");
		b = in.nextInt();
		System.out.println("Insira a terceira parte a ser dividida:");
		c = in.nextInt();
		parteTotal = a+b+c;
		valorDividido = valorTotal / parteTotal;
		parteA = valorDividido * a;
		parteB = valorDividido * b;
		parteC = valorDividido * c;
		System.out.println("A parte A é: " + parteA);
		System.out.println("A parte B é: " + parteB);
		System.out.println("A parte C é: " + parteC);
	}

}
