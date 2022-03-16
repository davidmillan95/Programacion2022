package repasoExamen;

import java.util.Scanner;

public class PruebaExamen {
	static Scanner sc = new Scanner(System.in);
	static int opcionMenu1;
	static String opcionMenu2;
	static String opcionMenu3;
	static String nom;
	static String ap;
	static String dni;
	static String mail;
	
	public static void main(String[] args) {
		menu();
	}
		
	public static void menu() {
		do {
			System.out.println("Elige una opcion:");
			System.out.println("1. Introducir datos");
			System.out.println("2. Mostrar datos");
			System.out.println("0. Salir");
			opcionMenu1=Integer.parseInt(sc.nextLine());
			
			switch (opcionMenu1) {
				case 1:
					
						System.out.println("Elige una opcion:");
						System.out.println("a) Introducir nombre");
						System.out.println("b) Introducir apellido");
						System.out.println("c) Introducir DNI");
						System.out.println("d) Introducir mail");
						System.out.println("e) Salir");
						opcionMenu2=sc.nextLine();
						switch (opcionMenu2) {
							case "a":
								System.out.println("Escribe un nombre:");
								nom=sc.nextLine();
								break;
							case "b":
								System.out.println("Escribe el apellido:");
								ap=sc.nextLine();
								break;
							case "c":
								System.out.println("Escribe el dni:");
								dni=sc.nextLine();
								while (dni.length()!=9) {
									System.out.println("Cadena incorrecta. Introduce otra cadena:");
									dni=sc.nextLine();
								}
								break;
							case "d":
								System.out.println("Escribe el mail:");
								mail=sc.nextLine();
								break;
							case "e":
								break;
							default:
								System.out.println("Opcion no disponible");
								break;
						}
					
				break;
				
				case 2:
					System.out.println("Elige una opcion:");
					System.out.println("a) Mostrar nombre y apellido en vertical");
					System.out.println("b) Mostrar si el nombre es compuesto y mostrar cuantas palabras lo forman");
					System.out.println("c) Comprobar DNI");
					System.out.println("e) Salir");
					opcionMenu3=sc.nextLine();
					switch (opcionMenu3) {
						case "a":
							break;
						case "b":
							break;
						case "c":
								if (Examen.generaClave(dni)==true) {
									System.out.println("Coincide");
								}else {
									System.out.println("No coincide");
								}
							break;
						case "e":
							break;
						default:
							System.out.println("Opcion no disponible");
							break;
					}
					break;
					
				case 0:
					break;
				default:
					System.out.println("Opcion no disponible");
					break;
			
			}
		}while(opcionMenu1!=0);
	}
}

