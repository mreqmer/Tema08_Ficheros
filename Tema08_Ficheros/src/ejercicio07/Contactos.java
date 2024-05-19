package ejercicio07;

import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Contactos {

	static TreeSet<Contacto> contactos = new TreeSet<>();
	static Contacto[] auxContactos = new Contacto[20];
	static final int MAX_SIZE = 20;

	public static boolean addContacto(Contacto c) {
		boolean added = false;

		if (contactos.size() < MAX_SIZE) {
			contactos.add(c);
			added = true;
		}
		return added;
	}

	public static int buscaNombre(Contacto c) {
		boolean encontrado = false;
		int contador = 0;
		int telefono = 0;
//		auxContactos = contactos.toArray(auxContactos);
		
		if(contactos.contains(c)) {
			for(Contacto valor : contactos ) {
				if(valor.equals(c)) {
					telefono = valor.getTelefono();
				}
			}
		}else {
			telefono = -1;
		}
		
		
//		while (contador <= MAX_SIZE && !encontrado) {
//			if(auxContactos[contador].equals(c)) {
//				encontrado = true;
//				telefono = auxContactos[contador].getTelefono();
//			}else {
//				contador++;
//			}
//		}
		return telefono;
	}

	public static void listarContactos() {
		
		for (Contacto valor : contactos) {
			System.out.println(valor);
		}
	}
}
