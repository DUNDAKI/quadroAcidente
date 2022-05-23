package jota.br.mavenquickstart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import players.Oponentes;

public class Application {

	public static void main(String[] args) throws Exception {
		List<Oponentes> lista = new ArrayList<Oponentes>();
		Gson json = new Gson();
		
		String path = "C:/PROJETO DEV/PROJETO_ECLIPSE/MANIPULADOR_DE_AQRUVIOS/Quake.txt";
		String caminho = "C:/PROJETO DEV/PROJETO_ECLIPSE/MANIPULADOR_DE_AQRUVIOS/Oponentes.txt";

		
		BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
				linha = buffRead.readLine();
		}
		buffRead.close();
	}
	
	//CONVERTER TXT TO JSON
		
	

}
