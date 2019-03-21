package examen.ejercicio3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<String> compuestos = new TreeSet<String>();

		System.out.print("Introduzca el número de compuestos: ");
		int numCompuestos = sc.nextInt();

		for (int i = 0; i < numCompuestos; i++) {
			System.out.print("Introduce el compuesto: ");
			String compuesto = sc.next();

			compuestos.add(compuesto);

		}
		System.out.print(compuestos);
	}
}
