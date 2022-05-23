package quadroAcidente;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuadroAcidente {

	public static void main(String[] args) {
		
		Thread atualizaHora = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					while (true) {
						Date date = new Date();
						StringBuffer data = new StringBuffer();
						
						SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); // Para Atualizar a DATA so mudar para o formato dd/MM/yyyy
					//	textFieldHorario.setText(data.toString() + sdf.format(date));
						System.out.println(data.toString() + sdf.format(date));
						Thread.sleep(1000);
						
						//textFieldHorario.revalidate();
					}
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				
			}
		});
		atualizaHora.start();
		
		
	}

}
