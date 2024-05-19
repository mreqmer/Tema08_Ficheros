package ejercicio02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int num;
		int suma = 0;
		double media = 0;
		
		try {
			Scanner sc = new Scanner(new FileReader("src/ejercicio02/numeritos.txt"));
		
			while(sc.hasNextInt()) {
				num = sc.nextInt();
				numeros.add(num);
				suma += num;
			}
			
			media = (double) suma / numeros.size();
			
			System.out.println("Suma: " + suma);
			System.out.println("Media: " + media);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
