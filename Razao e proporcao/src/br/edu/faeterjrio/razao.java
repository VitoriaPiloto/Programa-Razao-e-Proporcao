package br.edu.faeterjrio;

import java.util.Scanner;

public class razao {

	public static void main(String[] args) {
		/*
		QUESTÃO 02 (SLIDE):  
		.. ESCALA !!
		VALORES: 
		PARAFUSO NO DESENHO: 0,05
		NUMERADOR: 1
		DENOMINADOR: 200
		RESULTADO: 10 
		---------------------------
		PROBLEMA 2: 
		No mapa, o trajeto total da tocha olímpica em território brasileiro mede cerca de 72 cm, considerando os trechos por via aérea e por terra.
		A distância real, em quilômetros, percorrida pela tocha em seu trajeto completo, é de aproximadamente:
		a) 3 600
		b) 7 000
		c) 36 000 <--- ESSA É A RESPOSTA CERTA
		d) 70 000 
		OBS::: (A ESCALA NA IMAGEM DA QUESTÃO  É 1:50.000.000)
		 */
		char continua = 's';
		Scanner in = new Scanner(System.in);
		System.out.println("--------- PROGRAMA ESCALA DESENHO/REALIDADE ---------\n\n");
		while (continua == 's') {
			menu();
			System.out.println("Deseja continuar? [s/n]");
			continua =in.nextLine().charAt(0);
		}
		System.out.println("\n--------- PROGRAMA FINALIZADO ---------");
	}		

	public static void menu() {
		int numero;
		Scanner in = new Scanner(System.in);
		System.out.println("-------- MENU --------");
		System.out.println("1- CALCULAR VALOR REAL \n2- CALCULAR VALOR DESENHO");
		numero = in.nextInt();
		switch(numero) {
			case 1:
				elementoRealidade();
				break;
			case 2:
				elementoDesenho();
				break;
		}
	}
	
	public static void elementoRealidade() {
		double valorDesenho, valorRealidade;
		int numeradorEscala, denominadorEscala;
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a medida do elemento no desenho?: ");
		valorDesenho = in.nextDouble();
		System.out.println("Qual o valor do numerador na escala?: ");
		numeradorEscala = in.nextInt();
		System.out.println("Qual o valor do denominador na escala?: ");
		denominadorEscala = in.nextInt();
		valorRealidade = (valorDesenho * denominadorEscala) / numeradorEscala;
		System.out.println("------------------");
		System.out.println("\nO resultado é:\t\n" + valorRealidade);
	}
	
	/*
	EXEMPLO PARA TESTE:
	Escala, em cartografia, é a relação matemática entre as dimensões reais do objeto e a sua representação no mapa. 
	Assim, em um mapa de escala 1:50.000, uma cidade que tem 4,5 Km de extensão entre seus extremos será representada com
	a) 9 cm. <---ESSA É A RESPOSTA CORRETA
	b) 90 cm.
	c) 225 mm.
	d) 11 mm.
	 */
	public static void elementoDesenho() {
		double valorDesenho, valorRealidade;
		int denominadorEscala;
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a medida do elemento na realidade? (em centimetros)\n");
		valorRealidade = in.nextDouble();
		
		System.out.println("Qual o valor do denominador na escala?\n ");
		denominadorEscala = in.nextInt();
		valorDesenho = valorRealidade/denominadorEscala;
		System.out.println("------------------");
		System.out.println("\nO resultado é:\t\n" + valorDesenho);
	}
}
