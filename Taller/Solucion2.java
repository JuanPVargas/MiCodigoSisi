package Taller;

import javax.swing.JOptionPane;

public class Solucion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ValorCompra;
		double descuento = 0.20;

//se le solicita al usuario ingresar el valor de su compra
		ValorCompra =  Double.parseDouble(JOptionPane.showInputDialog("inserte el valor de su compra "));
		
//se genera un condiciional que cuando el valor sea menor a 299.9, imprima el valor de la compra 
		if (ValorCompra < 299.9) {
			JOptionPane.showMessageDialog(null, "su compra es de " + ValorCompra);
		}
	
//se genera otro condicional que cuando el valor sea mayor o igual a 300, imprima el valor de la compra mas el descuento
		else if (ValorCompra >= 300) {
			
			double CompraDescuento = ValorCompra - (ValorCompra * descuento);
			JOptionPane.showMessageDialog(null, "su compra es de " + CompraDescuento );
		}
		
	}
}

