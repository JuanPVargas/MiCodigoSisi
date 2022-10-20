package TallerDeMetodos;

import javax.swing.JOptionPane;

public class Punto2 {

	public static void main(String[] args) {
		String palabra = JOptionPane.showInputDialog("digite una palabra o frase");
		int e = Integer.parseInt(JOptionPane.showInputDialog("que desea hacer con lo digigitado:\n1.Cambiar a mayuscula\n2.calcular numero de letras\n3.Cambiar a miniscula"));
		switch(e) {
		case 1:
			mayuscula(palabra);
			break;
		case 2:
			numeroLetras(palabra);
			break;
		case 3:
			minuscula(palabra);
			break;
		default:JOptionPane.showMessageDialog(null, "elija una de las 3 opciones");
		break;
		}
	}
	public static void mayuscula(String palabra) {
		JOptionPane.showMessageDialog(null, palabra.toUpperCase());
	}
	public static void minuscula(String palabra) {
		JOptionPane.showMessageDialog(null, palabra.toLowerCase());
	}
	public static void numeroLetras(String palabra) {
		int o = Integer.parseInt(JOptionPane.showInputDialog("1.contar contando espacios\n2.contar sin espacios"));
		int numeroLetras=0;
		if(o==2) {
			for (int i=0; i<palabra.length(); i++) {
				if(palabra.charAt(i)!= ' ') {
					numeroLetras++;
				}
			}
			JOptionPane.showMessageDialog(null, numeroLetras+" es el numero de caracteres que tiene "+palabra+" sin contar los espacios");
		}
		else if(o==1){
			JOptionPane.showMessageDialog(null, palabra.length()+" es el numero de caracteres que tiene "+palabra+" contando los espacios");
		}
		else {
			JOptionPane.showMessageDialog(null, "elija una de las 2 opciones");
		}
	}
}
