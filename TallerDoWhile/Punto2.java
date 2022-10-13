package TallerDoWhile;

public class Punto2 {

	public static void main(String[] args) {
		
		int suma = 0;
		int i = 2;
		do {
			suma = suma + i;
			i=i+2;
		}while(i<=100);
		System.out.println("la suma de los numeros pares del 2 al 100 es: "+suma);
	}
}
