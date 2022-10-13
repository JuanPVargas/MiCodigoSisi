package ArraysBidimensionales;

import javax.swing.JOptionPane;

public class Punto2 {

	public static void main(String[] args) {
		
		int[][]primero= new int [5][5];
		int[][]segundo= new int [5][5];
		
		for(int i = 1; i<=5; i++){
			for(int j=1;j<=5;j++){
				primero[i-1][j-1]=(int)(Math.random()*9+1);
				System.out.println(primero[i-1][j-1]);
			}
		}
		System.out.println("---------");
		for(int i = 1; i<=5; i++){
			for(int j=1;j<=5;j++){
				segundo[i-1][j-1]=(int)(Math.random()*9+1);
				System.out.println(segundo[i-1][j-1]);
			}
		}
		System.out.println("Resultado:\n");
		
		String operacion = JOptionPane.showInputDialog(null,
				"¿que operacion desea realizar con estos numeros?\n Si es suma seleccione: + \n Si es resta seleccione: - \n Si es multiplicacion seleccione: *  ");
		
		switch (operacion) {
		case "+":
			int[][]suma= new int [5][5];
			for(int i = 1; i<=5; i++){
				for(int j=1;j<=5;j++){
					suma[i-1][j-1]=(primero[i-1][j-1]+segundo[i-1][j-1]);
					System.out.println(suma[i-1][j-1]);
				}
			}
			break;
		case "-":
			int[][]resta= new int [5][5];
			for(int i = 1; i<=5; i++){
				for(int j=1;j<=5;j++){
					resta[i-1][j-1]=(primero[i-1][j-1]-segundo[i-1][j-1]);
					System.out.println(resta[i-1][j-1]);
				}
			}
			break;
		case "*":
			int[][]multiplicacion= new int [5][5];
			for(int i = 1; i<=5; i++){
				for(int j=1;j<=5;j++){
					multiplicacion[i-1][j-1]=(primero[i-1][j-1]*segundo[i-1][j-1]);
					System.out.println(multiplicacion[i-1][j-1]);
				}
			}
		}
	}
}
