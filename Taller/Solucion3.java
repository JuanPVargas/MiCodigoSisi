package Taller;

import javax.swing.JOptionPane;

public class Solucion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		
		//se le piden al usuario 2 numeros enteros cualesquiera
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero cualquiera"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero entero cualquiera"));
		
		//si el numero1 es mayor al numero2 imprimir resultado
		if (numero1 > numero2) {
			JOptionPane.showMessageDialog(null, numero1 + " es mayor " + ", " + numero2 + " es menor");
		}
		
		//si el numero1 es menor al numero2 imprimir resultado
		else if (numero1 < numero2) {
			JOptionPane.showMessageDialog(null, numero1 + " es menor " + ", " + numero2 + " es mayor");
		}
		
		//si ambos numeros son iguales imprimir resultado
		else if (numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "son iguales");	
		}

	}

}
