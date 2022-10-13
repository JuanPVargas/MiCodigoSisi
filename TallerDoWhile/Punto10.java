package TallerDoWhile;

import java.util.Scanner;

public class Punto10 {

	public static void main(String[] args) {
		Scanner numero= new Scanner(System.in);
		
		int num =0;
		System.out.println("teclee un numero entero cualquiera positivo");
		int n = numero.nextInt();
		
		while(num<=n){
			int r= 0;
			while (r<num) {
				System.out.print(num);
				r++;
			}
			System.out.println("");
			num++;
		}
	}
}
