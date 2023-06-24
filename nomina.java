package Viernes;

import java.util.Scanner;

public class nomina {
		
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Sueldos Neto = new Sueldos();
		
		System.out.println("¿Cual es tu nombre? : ");
		String nombre = scanner.nextLine();
		
		System.out.println("¿Cual es tu puesto? : ");
		String puesto = scanner.nextLine();
		
		System.out.println("Ingrese la cantidad de horas trabajadas en la semana: ");
		Neto.settiempo_hrs(scanner.nextDouble());
		
		System.out.println("Ingrese la cantidad de horas extras trabajadas en la semana: ");
		Neto.settiempo_extra(scanner.nextDouble());
				
		System.out.println("Sueldo neto: " +Neto.SueldoNeto());
		
	}

}
