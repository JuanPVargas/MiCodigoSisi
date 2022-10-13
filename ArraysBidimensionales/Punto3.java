package ArraysBidimensionales;

public class Punto3 {

	public static void main(String[] args) {
		
		int Matriz[][]= {{11, 12, 13},{21, 22, 23}};
		
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" a"+Matriz[i][j]);
			}
			System.out.println("");
	 	}
		System.out.println("----------------");
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(" a"+Matriz[j][i]);
			}
			System.out.println("");
		}
	}
}
