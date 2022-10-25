package Quiz_25_10_2022;

import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {

		int numero1, numero2, resultado;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero entero"));

		String operacion = JOptionPane.showInputDialog(null,
				"¿que desea realizar con estos numeros?\n ver el numero mayor, seleccione: a\n ver el numero menor, seleccione: b\n calcular raiz cuadrada, seleccione: c\n elevar a una potencia, seleccione: d ");

		switch (operacion) {
		case "a":
			mayor(numero1, numero2);
			break;
		case "b":
			menor(numero1, numero2);
		case "c":
			raiz(numero1, numero2);			
			break;
		case "d":
			potencia(numero1, numero2);
			break;
		}
	}
	public static void mayor(int numero1, int numero2) {
		if (numero1 > numero2) {
			JOptionPane.showMessageDialog(null, numero1 + " es mayor ");
		}
		else if (numero1 < numero2) {
			JOptionPane.showMessageDialog(null, numero2 + " es mayor");
		}
	}
	public static void menor(int numero1, int numero2) {
		if (numero1 > numero2) {
			JOptionPane.showMessageDialog(null, numero2 + " es menor ");
		}
		else if (numero1 < numero2) {
			JOptionPane.showMessageDialog(null, numero1 + " es menor");
		}
	}
	public static void raiz(int numero1, int numero2) {

		JOptionPane.showMessageDialog(null, "la raiz cuadrada de " + numero1+ " es: "+Math.sqrt(numero1));
		JOptionPane.showMessageDialog(null, "la raiz cuadrada de " + numero2+ " es: "+ Math.sqrt(numero2));
	}
	public static void potencia(int numero1, int numero2) {

		int potencia = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));

		JOptionPane.showMessageDialog(null,  numero1+ " elevado a: "+ potencia + Math.pow(numero1, potencia));
		JOptionPane.showMessageDialog(null, +numero2+ " elevado a: "+ potencia + Math.pow(numero2, potencia));
	}
}

