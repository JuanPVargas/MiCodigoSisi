package TallerDeMetodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto1 {

	public static Scanner inicio=new Scanner(System.in);
	public static void main(String[] args) {

		int op=-1;
		double base = 0, altura = 0, radio = 0, area = 0;

		while(op != 0){
			op=menu();
			switch(op) {
			case 1:
				base=Valor("Ingrese la base aqui= ");
				altura=Valor("Ingrese la altura aqui= ");
				area=(base*altura)/2;
				System.out.println("\nEl area del triangulo es: " + area + "\n");
				break;
			case 2:
				radio=Valor("Ingrese el radio del circulo aqui= ");
				area=Math.PI*(Math.pow(radio,2));
				System.out.println("\nEl area del circulo es: " + area + "\n");
				break;
			case 3:
				base=Valor("Ingrese la base o la altura del cuadrado aqui= ");
				area=(base*base);
				System.out.println("\nEl area del cuadrado es: " + area + "\n");
				break;				
			case 4:
				base=Valor("Ingrese la base aqui= ");
				altura=Valor("Ingrese la altura aqui= ");
				area=(base*altura);
				System.out.println("\nEl area del rectangulo es: " + area + "\n");
				break;
			}
		}
		inicio.close();
	}
	private static double Valor(String texto) {
		while(true){
			try {
				System.out.print(texto);
				return inicio.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("El numero es invalido.");
				inicio.nextLine();
			}
		}
	}
	private static int menu() {
		int op=-1;
		System.out.println("\n----------------------------");
		System.out.println("1-Area de un triangulo.");
		System.out.println("2-Area de un circulo.");
		System.out.println("3-Area de un cuadrado.");
		System.out.println("4-Area de un rectangulo..");
		System.out.println("0-Salir.");
		System.out.println("\nSelecciona una opción.");
		while(op<0) {
			try {
				op=inicio.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Opcion no valida, selecione una de las opciones anteriores.");
				inicio.nextLine();
				op=-1;
			}
		}
		return op;
	}
}
