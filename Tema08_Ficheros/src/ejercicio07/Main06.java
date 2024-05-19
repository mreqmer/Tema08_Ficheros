package ejercicio07;

import java.util.Scanner;

public class Main06 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		
		int opc;

		Ficheros.leerFichero();

		do {
			do {

				menu();
				opc = sc.nextInt();

				switch (opc) {
				case 1 -> {
					Contactos.addContacto(newContacto());
				}
				case 2 -> {
					buscarNombre();
				}
				case 3 -> {
					Contactos.listarContactos();
				}
				case 4 -> {
					System.out.println("Saliendo...");
					Ficheros.escribirFichero();
				}
				}

			} while (opc < 0);
		} while (opc != 4);

	}

	public static void buscarNombre() {
		Contacto c;
		String nombre;
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		c = new Contacto(nombre);
		if(Contactos.buscaNombre(c)!= -1) {
			System.out.println(Contactos.buscaNombre(c));
		}else {
			System.out.println("Error, contacto no existente");
		}
		
	}

	public static void menu() {
		System.out.println("1.Nuevo contacto.");
		System.out.println("2.Buscar por nombre");
		System.out.println("3.Mostrar todos");
		System.out.println("4.Salir");
	}

	public static Contacto newContacto() {
		Contacto c;
		String nombre;
		int telefono;

		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		System.out.println("Telefono: ");
		telefono = sc.nextInt();

		c = new Contacto(nombre, telefono);

		return c;
	}

}
