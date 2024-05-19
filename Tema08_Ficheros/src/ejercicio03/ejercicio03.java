package ejercicio03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		
		int sumaEdades = 0;
		double mediaEdades =0;
		double sumaAlturas = 0;
		double mediaAltura=0;
		int edad;
		double altura;
		int contador=0;
		
		
		try {
			Scanner sc = new Scanner(new FileReader("src/ejercicio03/Alumnos.txt"));
			
			while (sc.hasNext()) {
				
				if(sc.hasNextInt()) {
					sumaEdades += sc.nextInt();
					
				}else if(sc.hasNextDouble()) {
					sumaAlturas += sc.nextDouble();
					
				}else {
					contador++;
					sc.next();
				}

			}
			
			mediaEdades = (double) sumaEdades / contador;
			mediaAltura = (double) sumaAlturas / contador;
			
			System.out.println("Suma edades: " + mediaEdades);
			System.out.println("Suma alturas: " + mediaAltura);
			

			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}


	}

}
