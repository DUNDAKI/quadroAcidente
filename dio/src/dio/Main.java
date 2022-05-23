package dio;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Calendar hoje = Calendar.getInstance();
	    int diaSeguinte = 0;
	    int soma = 0;
	    int  dia;
	    int diaAnterior;


	     //System.out.println("");
	    int contagemInicial = 629;
	    System.out.println("\n-----Contagem início-----\n");
	    System.out.println("Contagem início: " +contagemInicial + " dias");
	    System.out.println("20/05/2022");
	    System.out.println("\n--------------------------\n");
	    
	    
	    int ano = hoje.get(Calendar.YEAR);
	    int mes = hoje.get(Calendar.MONTH);
	    int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
	     // System.out.println(mes);
	     // System.out.println(ano);
	    
	    diaAnterior  = 0;
	    if(diaAtual < diaAnterior){
	        diaAnterior = 0;
	        System.out.println("Dia anterior foi zerado:" + diaAnterior);
	      }
	    
	    while(diaAtual > diaAnterior){
	      diaAnterior = diaAtual - 1;
	      System.out.println("Dia anterior é: "+ diaAnterior);
	      System.out.println("\n--------------------------\n");
	      
	      System.out.println("Informe um dia");
	      dia = sc.nextInt();
	      diaAtual= dia;
	    

	      if(diaAtual > diaAnterior){
	        contagemInicial++;
	        System.out.println("Contagem início: " +contagemInicial + " dias");
	      }else{
	        diaAnterior = 0;
	      }

	     }
		sc.close();

	}
	
	

}
