package TallerDoWhile;

import java.util.Scanner;

public class Punto6 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("ingrese un número");
		int numero = n.nextInt();
		
		 while(numero <20){
			 System.out.println("ingrese otro numero");
			  numero = n.nextInt();
		}
		 System.out.println("bien");
	}
}