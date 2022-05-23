package exercicios_unicesumar;

import java.util.Scanner;

public class Main {
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		atividade1();
		
			
			
	}
	
	
	
	public static void atividade1() {
		
		
		Scanner entrada = new Scanner(System.in);
        int notaAluno[] = new int[3];
        double total = 0;
        for(int i = 0; i < notaAluno.length; i++) {
            System.out.println("Informe o numero da nota do aluno [" + i + "]" );
            notaAluno[i] = entrada.nextInt(); 
            total += notaAluno[i];
        }
        System.out.println("A Media dos alunos eh " + total / 3);

		
		
		
	}
	
	public static void atividade2(int n) {
   
		
		int x = 1;
		
		
		
		
		
		
		if(x < n) {
			
			
			
			if(n % 2 ==0) {
				System.err.println(n + " é par");
			}else {
				System.err.println(n +" é primo");
			}
		}else {
			System.out.println();
		}
	}

}
