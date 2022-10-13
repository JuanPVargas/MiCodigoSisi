package Arreglos;

import javax.swing.JOptionPane;

public class Punto5 {
	
	public static void main(String[] args) {
		
		int ingresos = 0;
		String i;
		String producto[]; int precio[];
		producto=new String[6]; precio=new int[6];
		producto[0]=("Doritos"); precio[0]=2000;
		producto[1]=("chocolatina"); precio[1]=1800;
		producto[2]=("cheetos");precio[2]=1500;
		producto[3]=("galletas");precio[3]=1200;
		producto[4]=("yogurt");precio[4]=1600;
		producto[5]=("jugo");precio[5]=1700;
	
		do {
			String seleccion = JOptionPane.showInputDialog("¡Hola! bienvenido a CANDYSHOP\nSelecciona la accion que deseas realizar\na)Mostrar los productos y sus precios.\nb)Vender un producto.\nc)Mostrar el total de ingresos.\nd)Cambiar Precio.");
			switch (seleccion) {
			case"a":
				for(int n=0; n<precio.length; n++) {
					JOptionPane.showMessageDialog(null,producto[n]+":  $"+precio[n]);
				}
				break;
			case"b":
				int pv = Integer.parseInt(JOptionPane.showInputDialog("¿Que producto desea vender?:\n1.Doritos\n2.chocolatina\n3.cheetos\n4.galletas\n5.yogurt\n6.jugo"));
				int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos "+producto[pv-1]+" desea vender?"));
				int venta = c*precio[pv-1];
				ingresos = ingresos+venta;
				break;
			case"c":
				JOptionPane.showMessageDialog(null,"los ingresos actuales son: "+ingresos);
				break;
			case"d":
				int cp = Integer.parseInt(JOptionPane.showInputDialog(null,"¿A que producto desea cambiarle el precio?:\n1.Doritos\n2.chocolatina\n3.cheetos\n4.galletas\n5.yogurt\n6.jugo"));
				precio[cp-1] = Integer.parseInt(JOptionPane.showInputDialog("¿Que precio desea ponerle a "+producto[cp-1]+"?"));
				break;
			}
			i = JOptionPane.showInputDialog("Desea volver a ver el menu Si/No");
		}
		while(i.equals("S")||i.equals("SI")||i.equals("si")||i.equals("Si")||i.equals("s"));
	}
}
