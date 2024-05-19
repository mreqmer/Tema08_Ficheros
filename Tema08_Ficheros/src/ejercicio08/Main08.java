package ejercicio08;

import java.util.Scanner;

import ejercicio07.Contacto;
import ejercicio07.Contactos;
import ejercicio07.Ficheros;

public class Main08 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		int opc;

		Fichero.leerFichero();

		do {
			do {
				menu();
				opc = sc.nextInt();
				sc.nextLine();

				switch (opc) {
				case 1 -> {
					if(Temperaturas.addTemperatura(newTemperatura())) {
						System.out.println("Añadida.");
					}else {
						System.out.println("Error.");
					}
				}
				case 2 -> {
					Temperaturas.listar();
				}
				case 3 -> {
					System.out.println("Saliendo...");
				}
				default -> {
					System.out.println("Letra no válida.");
				}
				}

			} while (opc < 0);
		} while (opc != 4);

	}
	
	public static void menu() {
		System.out.println("1.Añadir temperatura");
		System.out.println("2.Listar temperaturas");
		System.out.println("3.Salir");
	}

	public static Temperatura newTemperatura() {
		Temperatura t;
		String fecha;
		int tMin;
		int tMax;

		System.out.println("Fecha: ");
		fecha = sc.nextLine();
		System.out.println("Temperatura mínima: ");
		tMin = sc.nextInt();
		sc.nextLine();
		System.out.println("Temperatura máxima: ");
		tMax = sc.nextInt();
		sc.nextLine();
		t = new Temperatura(fecha, tMin, tMax);

		return t;
	}
	
}
