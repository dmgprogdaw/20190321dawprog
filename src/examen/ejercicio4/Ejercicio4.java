package examen.ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Map<String, String> agenda = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		String nombre;
		String numero = null;
		String elegir;
		do {
			System.out.print("Introduce el nombre: ");
			nombre = sc.nextLine();
			System.out.print("Introduce el número: ");
			numero = sc.nextLine();

			agenda.put(nombre, numero);
			System.out.println(agenda);

			do {
				System.out.print("¿Ahora que desea hacer: introducir, buscar? ");
				elegir = sc.nextLine();
			
				if (elegir.equals("introducir")) {
					System.out.print("Introduce el nombre: ");
					nombre = sc.nextLine();
					System.out.print("Introduce el número: ");
					numero = sc.nextLine();

					agenda.put(nombre, numero);
					System.out.println(agenda);

					if (agenda.containsKey(nombre)) {
						agenda.replace(numero, numero);
					} else {
						agenda.put(nombre, numero);
					}
				}
				else if (elegir.equals("buscar:")) {
					System.out.print("Que contacto desea buscar: ");
					nombre = sc.nextLine();
					if (agenda.containsKey(nombre)) {
						System.out.println(nombre + "-" + numero);
					} 
					else {
						System.out.println(nombre + " no existe");
					}
				}
			}while(elegir.equals("introducir") || elegir.equals("buscar:"));
				
		} while (elegir.equals("fin"));
		sc.close();
	}
}
