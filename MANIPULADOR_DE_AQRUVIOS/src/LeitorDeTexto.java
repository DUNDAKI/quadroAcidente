import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import players.Jogador;

public class LeitorDeTexto {

	public static void main(String[] args) throws FileNotFoundException {
		File txt = new File("C:/PROJETO DEV/PROJETO_ECLIPSE/MANIPULADOR_DE_AQRUVIOS/Quake.txt");
		File docs = new File("C:/PROJETO DEV/PROJETO_ECLIPSE/MANIPULADOR_DE_AQRUVIOS/Quake.docx");
		
		JsonObject jsonObject = new JsonObject();
		List<Jogador> list = new ArrayList<>(); 
		
		
        Scanner obj = new Scanner(txt);

        while (obj.hasNextLine()) {
          //  System.out.println(obj.nextLine());
        String lista = new Gson().toJson(obj.nextLine());
        
        System.out.println(lista);
        
        
        }
		
        
	}

}
