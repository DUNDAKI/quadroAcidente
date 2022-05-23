package quadroAcidente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		LocalDate dia_anterior, hoje;
		

		int contagemInicial = 629;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		hoje = LocalDate.now();
		dia_anterior = LocalDate.of(2022,5,18);
		
		
		long days = ChronoUnit.DAYS.between(dia_anterior, hoje);
		
		System.out.println("Diferenša de dias: " + days);
		
		for (int i = 1; i <= days; i++) {
			System.out.println("Contador: " + i);
			
			contagemInicial+=1;
			
			System.out.println("Quadro Acidentes: " + contagemInicial);
			
			
		}	

		sc.close();
	}

}
