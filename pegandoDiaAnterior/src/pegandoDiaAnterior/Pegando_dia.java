package pegandoDiaAnterior;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Pegando_dia {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		int contagem = 631;
		
		Date dia_anterior = new Date();
		Date hoje = new Date();

		Calendar cal = Calendar.getInstance();
		
		cal.setTime(dia_anterior ); 
		cal.add(Calendar.DATE, -1);
		dia_anterior = cal.getTime();
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(hoje ); 
		cal2.add(Calendar.DATE, 0);
		hoje = cal2.getTime();
		
		System.out.println("Data anterior: " +sdf.format(dia_anterior));
		System.out.println("Data: " +sdf.format(hoje));
		
		if(dia_anterior.before(hoje)) {}
		
			
			while(dia_anterior.before(hoje)) {
				contagem++;
				System.out.println("Contagem Atualizada: " + contagem);
				break;
				
			}
			
		
		
		
	}
	

}
