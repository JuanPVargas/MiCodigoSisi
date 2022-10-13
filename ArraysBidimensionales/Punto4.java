package ArraysBidimensionales;

import javax.swing.JOptionPane;

public class Punto4 {

	public static void main(String[] args) {
			
		int[]edad=new int [7];
		edad[0]=17;
		edad[1]=22;
		edad[2]=23;
		edad[3]=15;
		edad[4]=28;
		edad[5]=16;
		edad[6]=20;
		
		boolean comparacion1 = edad[0]>=18;
		JOptionPane.showMessageDialog(null, edad[0]+ " años, ¿es mayor de edad?:\n "+comparacion1);
		boolean comparacion2 = edad[1]>=18;
		JOptionPane.showMessageDialog(null, edad[1]+ " años, ¿es mayor de edad?:\n "+comparacion2);
		boolean comparacion3 = edad[2]>=18;
		JOptionPane.showMessageDialog(null, edad[2]+ " años, ¿es mayor de edad?:\n "+comparacion3);
		boolean comparacion4 = edad[3]>=18;
		JOptionPane.showMessageDialog(null, edad[3]+ " años, ¿es mayor de edad?:\n "+comparacion4);
		boolean comparacion5 = edad[4]>=18;
		JOptionPane.showMessageDialog(null, edad[4]+ " años, ¿es mayor de edad?:\n "+comparacion5);
		boolean comparacion6 = edad[5]>=18;
		JOptionPane.showMessageDialog(null, edad[5]+ " años, ¿es mayor de edad?:\n "+comparacion6);
		boolean comparacion7 = edad[6]>=18;
		JOptionPane.showMessageDialog(null, edad[6]+ " años, ¿es mayor de edad?:\n "+comparacion7);
		
		int EdadPromedio = edad[0]+edad[1]+edad[2]+edad[3]+edad[4]+edad[5]+edad[6];
		int Promedio = EdadPromedio/7;
		JOptionPane.showMessageDialog(null, "el promedio de edad es de: "+Promedio+" años");
	
	}
}
