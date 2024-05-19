package ejercicio07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros {
	
	public static void leerFichero() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/ejercicio07/agenda.txt"));
			String linea;
			String[] partes;
			Contacto c = null;
			while((linea = br.readLine()) != null) {
				partes = linea.split("::");
				c = new Contacto(partes[0], Integer.parseInt(partes[1]));
				Contactos.addContacto(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// leer
	
	public static void escribirFichero() {
		
		BufferedWriter in= null;
		
		try {
			in = new BufferedWriter(new FileWriter("src/ejercicio07/agenda.txt"));
			for(Contacto valor : Contactos.contactos) {
				in.write(valor.toString());
				in.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.flush();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
