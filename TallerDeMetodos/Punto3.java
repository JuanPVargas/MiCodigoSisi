package TallerDeMetodos;

import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Color1;
		System.out.print("Seleccione un color:\n - Para rojo teclee 1\n - Para amarillo teclee 2\n - Para azul teclee 3\nColoque el valor aqui=");
		Color1 = sc.nextInt();
		
		int Color2;
		System.out.print("\nSeleccione otro color:\n - Para rojo teclee 1\n - Para amarillo teclee 2\n - Para azul teclee 3\nColoque el valor aqui=");
		Color2 = sc.nextInt();

		int mezcla=color3(Color1,Color2);
	}
	public static int color3(int Color1, int Color2) {

		int mezcla=Color1+Color2;
		
		if(Color1==1&&Color2==2||Color1==2&&Color2==1) {
			System.out.println("\nLa mezcla entre estos colores es naranja");
		}
		else 
			if(Color1==1&&Color2==3||Color1==3&&Color2==1) {
			System.out.println("\nLa mezcla entre estos colores es morado");
		}
		else 
			if(Color1==2&&Color2==3||Color1==3&&Color2==2) {
				System.out.println("\nLa mezcla entre estos colores es verde");
		}
		else 
			if(Color1==2&&Color2==2||Color1==3&&Color2==3||Color1==1&&Color2==1){
				System.out.println("\nEs el mismo color");
		}
		else {
			System.out.println("\nERROR, tiene que digitar un numero entre 1 y 3");
		}
		return mezcla;
	}
}

