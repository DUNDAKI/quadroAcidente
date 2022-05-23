package exercicios_unicesumar.atividade1;

import java.util.Scanner;

public class Atividade1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		atividade1Caso1();
		atividade1Caso2();
	}

	public static void atividade1Caso1() {
		System.out.println("Informe 3 numeros");

		int cont = 3, n;
		int soma = 0, media = 0;

		for (int i = 0; i < cont; i++) {
			n = sc.nextInt();

			soma = soma + n;

			media = soma / cont;
		}
		System.out.println("soma é: " + soma);
		System.out.println("A media é: " + media);
		System.exit(0);
	}
	
	
	public static void atividade1Caso2() {
		System.out.println("Insira numero");
		
		
		int n, cont = -1, soma = 0;
		
		
		for (int i = 0; i > -1; i++) {
			n = sc.nextInt();
			

			soma = soma + n;
			
			System.out.println("A soma é: " + soma);
			
		}
		
	}

}
