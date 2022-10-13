package ArraysBidimensionales;


public class Punto1 {

	public static void main(String[] args) {
		
		int [][]n= new int[11][11];
		for(int i = 1; i<n.length; i++){
			for(int j=1;j<n.length;j++){
				n[i][j]= i*j;
				System.out.println(i + " x " + j + " = " + n[i][j] );
			}
			System.out.println();
		}
	}
}
