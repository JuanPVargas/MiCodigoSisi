package Taller;

import javax.swing.JOptionPane;

public class Solucion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		
		//se le pide al usuario insertar un numero natural cualquiera
		numero =  Double.parseDouble(JOptionPane.showInputDialog("inserte un numero natural cualquiera"));
		
		//si es menor a 0 decir que es negativo 
		if (numero < 0 ) {
			JOptionPane.showMessageDialog(null, "el número " + numero +  " es negativo.");	
		}
		
		//si es mayor a 0 decir que es positivo
		else if (numero > 0) {
			JOptionPane.showMessageDialog(null, "el numero " + numero + " es positivo");
		}
		
		//si el numero es igual a 0 decir que es 0
		else if (numero == 0) {
			JOptionPane.showMessageDialog(null, "el numero es 0 " );
		}
	}
}
