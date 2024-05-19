package ejercicio04;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final String FINAL = "fin";
		String palabra = "";
		
		BufferedWriter in = null;
		
		try {
			in = new BufferedWriter(new FileWriter("src/ejercicio04/Texto.txt"));
			while(!palabra.equals(FINAL)) {
				System.out.println("Palabra: ");
				palabra = sc.nextLine();
				in.write(palabra + "\n");
			}
			
		}catch(FileNotFoundException e) {
			
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
