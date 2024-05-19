package ejercicio03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Meequivoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre = "";
		String edad ;
		String altura;
		char siguiente = 'S';
		
		BufferedWriter in= null;
		
		try {
			in =  new BufferedWriter(new FileWriter("src/ejercicio03/Alumnos.txt"));
			
			while(siguiente == 'S') {
				System.out.println("Nombre: ");
				nombre = sc.nextLine() + " ";
				in.write(nombre);
				
				System.out.println("Edad:");
				edad = sc.nextInt() + " ";
				sc.nextLine();
				in.write(edad);
				
				System.out.println("Altura: ");
				altura=sc.nextDouble() + " ";
				sc.nextLine();
				in.write(altura);
				
				System.out.println("¿Siguiente?");
				siguiente = sc.next().charAt(0);
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				in.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
