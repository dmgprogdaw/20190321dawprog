package examen.ejercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {

	public static void main(String[] args) {

		Set<String> agenda = new HashSet<String>();		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el contacto: ");
		String contacto = sc.next();
			
		if(agenda.contains(contacto)) {
			agenda.remove(contacto);
			agenda.add(contacto);
		}
		else {
			agenda.add(contacto);
		}
			
			
		System.out.println(agenda);
	}
}
/*

			
*/