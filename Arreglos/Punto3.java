package Arreglos;

public class Punto3 {

	public static void main(String[] args) {
		
		int contador=0;
		int[] n = new int [19];
		
		for(int i = 0;i<19;i++) {
			n[i] = (int)(Math.random()*2);
			System.out.println(n[i]);
			if (n[i]==0) {
				contador++;
		}
		}
		System.out.println("Hay:"+contador+" ceros");
	}
}