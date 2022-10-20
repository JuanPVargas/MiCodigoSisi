package TallerDeMetodos;

import javax.swing.JOptionPane;

public class Punto5 {

	public static void main(String[] args) {
		Double d = (double) 0, e = (double) 0, l = (double) 0, p = (double) 0;
		int seleccion = Integer.parseInt(JOptionPane.showInputDialog("que moneda tiene quiere convertir?\n1.dolares\n2.euros\n3.libras\n4.pesos mexicanos"));
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("digite la cantiadad de esa moneda:"));
		switch(seleccion) {
		case 1:
			dolares(d,e,l,p,cantidad);
			break;
		case 2:
			euros(d,e,l,p,cantidad);
			break;
		case 3:
			libras(d,e,l,p,cantidad);
			break;
		case 4:
			pesosMexicanos(d,e,l,p,cantidad);
			break;
		default:
			JOptionPane.showMessageDialog(null, "elija una de las 4 opciones");
			break;
		}
	}
	public static void dolares(double d, double e, double l, double p, double cantidad) {
		int seleccion = Integer.parseInt(JOptionPane.showInputDialog("a cual moneda desea convertir?\n1.euros\n2.libras\n3.pesos mexicanos"));
		switch(seleccion) {
		case 1:
			e = cantidad*1.02; JOptionPane.showMessageDialog(null, cantidad+" dolares son "+e+" euros");
			break;
		case 2:
			l = cantidad*0.89; JOptionPane.showMessageDialog(null, cantidad+" dolares son "+l+" libras");
			break;
		case 3:
			p = cantidad*20.13; JOptionPane.showMessageDialog(null, cantidad+" dolares son "+p+" pesos mexicanos");
			break;
		default: JOptionPane.showMessageDialog(null, "elija una de las 3 opciones");
		break;
		}
	}
	public static void euros(double d, double e, double l, double p, double cantidad) {
		int seleccion = Integer.parseInt(JOptionPane.showInputDialog("a cual moneda desea convertir?\n1.dolares\n2.libras\n3.pesos mexicanos"));
		switch(seleccion) {
		case 1:
			d = cantidad*0.98; JOptionPane.showMessageDialog(null, cantidad+" euros son "+d+" dolares");
			break;
		case 2:
			l = cantidad*0.87; JOptionPane.showMessageDialog(null, cantidad+" euros son "+l+" libras");
			break;
		case 3:
			p = cantidad*19.70; JOptionPane.showMessageDialog(null, cantidad+" euros son "+p+" pesos mexicanos");
			break;
		default: JOptionPane.showMessageDialog(null, "elija una de las 3 opciones");
		break;
		}
	}
	public static void libras(double d, double e, double l, double p, double cantidad) {
		int seleccion = Integer.parseInt(JOptionPane.showInputDialog("a cual moneda desea convertir?\n1.dolares\n2.euros\n3.pesos mexicanos"));
		switch(seleccion) {
		case 1:
			d = cantidad*1.12; JOptionPane.showMessageDialog(null, cantidad+" libras son "+d+" dolares");
			break;
		case 2:
			e = cantidad*1.15; JOptionPane.showMessageDialog(null, cantidad+" libras son "+e+" euros");
			break;
		case 3:
			p = cantidad*22.60; JOptionPane.showMessageDialog(null, cantidad+" libras son "+p+" pesos mexicanos");
			break;
		default:JOptionPane.showMessageDialog(null, "elija una de las 3 opciones");
		break;
		}
	}
	public static void pesosMexicanos(double d, double e, double l, double p, double cantidad) {
		int seleccion = Integer.parseInt(JOptionPane.showInputDialog("a cual moneda desea convertir?\n1.dolares\n2.euros\n3.libras"));
		switch(seleccion) {
		case 1:
			d = cantidad*0.050; JOptionPane.showMessageDialog(null, cantidad+" pesos mexicanos son "+d+" dolares");
			break;
		case 2:
			e = cantidad*0.051; JOptionPane.showMessageDialog(null, cantidad+" pesos mexicanos son "+e+" euros");
			break;
		case 3:
			l = cantidad*0.044; JOptionPane.showMessageDialog(null, cantidad+" pesos mexicanos son "+l+" libras");
			break;
		default:JOptionPane.showMessageDialog(null, "elija una de las 3 opciones");
		break;
		}
	}
}