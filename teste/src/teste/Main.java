package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		//teste();
		int contagemInicial = 629;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		Date d1 = df.parse("20/05/2022");
		System.out.println(d1);
		Date d2 = df.parse("23/05/2022");
		System.out.println(d2);
		long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar hor�rio de ver�o
		//System.out.println(dt / 86400000L);
		
		System.out.println("Hora: " + dt /86400000L );
		
		//long days = ChronoUnit.DAYS.between(d1, d2);
		
		if(dt >= 3) {
			System.out.println("� maior que");
			int soma = (int) (dt * 3);
			
			System.out.println("Resultado �: "+soma);
			
			
		}
		
		for (int i = 0; i < dt; i++) {
			System.out.println("contando: "+ i);
			contagemInicial += dt;
			break;
		}
		
		System.out.println("Contagem Atualizada: " + contagemInicial);

	}

	public static void teste() {
		int segundos;
		int minutos;
		int horas;
		Calendar data;

		try {
			while (true) {
				Thread.sleep(1000);
				data = Calendar.getInstance();
				horas = data.get(Calendar.HOUR_OF_DAY);
				minutos = data.get(Calendar.MINUTE);
				segundos = data.get(Calendar.SECOND);
				System.out.println(horas + ":" + minutos + ":" + segundos);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}