package TallerDeMetodos;

import javax.swing.JOptionPane;

public class Punto4 {

	public static void main(String[] args) {

		int v = 0, t = 0, d = 0;
		int e = Integer.parseInt(JOptionPane.showInputDialog(" que unidad desea obtener:\n1.velocidad\n2.tiempo\n3.distancia"));
		switch(e) {
		case 1:
			velocidad(v,t, d);
			break;
		case 2:
			tiempo(v,t,d);
			break;
		case 3:
			distancia(v,t,d);
			break;
		default:
			JOptionPane.showMessageDialog(null, "elija una de las 3 opciones");
			break;
		}
	}

	public static void velocidad(int v, int t, int d) {
		d = Integer.parseInt(JOptionPane.showInputDialog(" ingrese distancia:"));
		t = Integer.parseInt(JOptionPane.showInputDialog(" ingrese tiempo:"));
		v = d/t;
		JOptionPane.showMessageDialog(null, "la velocidad es: "+v);
	}
	public static void tiempo(int v, int t, int d) {
		d = Integer.parseInt(JOptionPane.showInputDialog(" ingrese distancia:"));
		v = Integer.parseInt(JOptionPane.showInputDialog(" ingrese velocidad:"));
		t = d/v;
		JOptionPane.showMessageDialog(null, "el tiempo es: "+t);
	}
	public static void distancia(int v, int t, int d) {
		t = Integer.parseInt(JOptionPane.showInputDialog(" ingrese tiempo:"));
		v = Integer.parseInt(JOptionPane.showInputDialog(" ingrese velocidad:"));
		d = v*t;
		JOptionPane.showMessageDialog(null, "la distancia es: "+d);
	}

}