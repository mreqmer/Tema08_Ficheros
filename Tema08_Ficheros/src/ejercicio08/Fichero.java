package ejercicio08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero {
	
	public static void leerFichero(){
		String[] partes;
		String linea;
		
		try {
			BufferedReader rd = new BufferedReader(new FileReader ("src/ejercicio08/registro.txt"));
			Temperatura t;
			//esto ignora el título del txt
			rd.readLine();
			linea = rd.readLine();
			while(linea != null) {
				partes = linea.split(",");
				t = new Temperatura (partes[0], Integer.parseInt(partes[1]), Integer.parseInt(partes[2]));
				Temperaturas.addTemperatura(t);
				linea = rd.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirFichero() {
		try {
			BufferedWriter in = new BufferedWriter(new FileWriter ("src/ejercicio08/registro.txt"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
